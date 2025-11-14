package p146_Fifa;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

// Renombramos la clase de AppEstudiante a AppJugador
public class AppJugador extends JFrame {

    // Modificado: Utileria y lista de Jugadores
    private final Utileria utilidad = new Utileria();
    private ArrayList<Jugador> listaJugadores; 
    private DefaultTableModel tableModel;
    private JPanel formPanel;
    private JTable table; // Referencia a la tabla para manipular la selección

    // Componentes del Formulario
    private JComponent[] inputFields;
    private JTextField txtNombre;
    private JComboBox<String> cmbNacionalidad;
    private JTextField txtPeso;
    private JTextField txtFechaNacimiento; // Se usará un JTextField para el formato YYYY-MM-DD
    private JComboBox<String> cmbPosicion;
    private JComboBox<String> cmbPie;
    private JSpinner spinRating;
    
    // Variables de estado
    private int registroActual = -1; 
    private boolean modoEdicion = false; 

    // Botones
    private JButton btnEditar;
    private JButton btnNuevo;
    private JButton btnGuardar;
    private JButton btnAnterior;
    private JButton btnSiguiente;
    private JButton btnEstadisticas;
    private JMenuItem itemBorrar; // Agregado para la función Ctrl+D

    public AppJugador() {
        // Título de la Ventana modificado
        super("Gestión de Jugadores FIFA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); 

        // 1. Crear Barra de Menús con Hotkeys
        setJMenuBar(crearBarraMenu());

        // 2. Panel Superior: JTable dentro de JScrollPane
        JScrollPane scrollPane = crearTablaPanel();
        add(scrollPane, BorderLayout.CENTER);

        // 3. Panel Inferior: Formulario de Entrada de Datos y Botones
        JPanel bottomPanel = new JPanel(new BorderLayout());
        JPanel formTitlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        formTitlePanel.add(new JLabel("Datos del Jugador"));
        bottomPanel.add(formTitlePanel, BorderLayout.NORTH);
        
        formPanel = crearInputPanel();
        bottomPanel.add(formPanel, BorderLayout.CENTER);
        
        JPanel buttonContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonContainer.add(crearButtonPanel());
        bottomPanel.add(buttonContainer, BorderLayout.SOUTH);
        
        add(bottomPanel, BorderLayout.SOUTH);
        
        // --- FUNCIONALIDAD DE INICIO ---
        // Modificado: Usar listaJugadores y utilidad.inicializar()
        listaJugadores = utilidad.inicializar(); 
        cargarDatosEnTabla(listaJugadores);
        
        habilitarPanelDatos(false);
        if (!listaJugadores.isEmpty()) {
            registroActual = 0;
            mostrarRegistroActual();
        }
        actualizarEstadoNavegacion();

        pack(); 
        // Ajustar tamaño para que se parezca al de la imagen
        setSize(Math.max(800, getWidth()), Math.max(650, getHeight())); 
        setLocationRelativeTo(null); 
        
        // Cargar las funcionalidades extra (Ctrl+D para borrar)
        configurarTeclasGlobales();
    }
    
    // --- Métodos de Creación de Componentes ---

    private JMenuBar crearBarraMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        // --- Menú Archivo ---
        JMenu menuArchivo = new JMenu("Archivo");
        
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        // Hotkey: Ctrl+A
        itemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK)); 
        itemAbrir.addActionListener(e -> accionAbrir());
        menuArchivo.add(itemAbrir);

        JMenuItem itemGrabar = new JMenuItem("Grabar");
        // Hotkey: Ctrl+G
        itemGrabar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK)); 
        itemGrabar.addActionListener(e -> accionGrabar());
        menuArchivo.add(itemGrabar);
        
        menuArchivo.addSeparator();
        
        // Agregado: Borrar registro
        itemBorrar = new JMenuItem("Borrar registro seleccionado");
        // Hotkey: Ctrl+D
        itemBorrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK)); 
        itemBorrar.addActionListener(e -> accionBorrar());
        menuArchivo.add(itemBorrar);
        
        menuArchivo.addSeparator();

        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0));
        menuArchivo.add(itemSalir);

        // --- Menú Ayuda ---
        JMenu menuAyuda = new JMenu("Ayuda");
        
        JMenuItem itemTeclas = new JMenuItem("Teclas de Acceso Rápido");
        itemTeclas.addActionListener(e -> accionTeclas()); // Agregado: Mostrar teclas
        menuAyuda.add(itemTeclas);
        
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de..");
        itemAcercaDe.addActionListener(e -> accionAcercaDe());
        menuAyuda.add(itemAcercaDe);

        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        
        return menuBar;
    }

    private JScrollPane crearTablaPanel() {
        // Columnas modificadas según la imagen
        String[] columnNames = {"Nombre", "Nacionalidad", "Peso (kg)", "F. Nacimiento", "Posición", "Pie", "Rating"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }; 
        table = new JTable(tableModel);
        
        // Listener para la selección de fila
        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1 && !modoEdicion) {
                registroActual = table.getSelectedRow();
                mostrarRegistroActual();
                // table.setRowSelectionInterval(registroActual, registroActual); // Ya lo hace implícitamente
                actualizarEstadoNavegacion();
            }
        });
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        return new JScrollPane(table);
    }

    private JPanel crearInputPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 

        // Definición de las etiquetas del formulario
        String[] labels = {"Nombre:", "Peso (kg):", "Posición:", "Rating (1-99):", 
                           "Nacionalidad:", "F. Nacimiento (YYYY-MM-DD):", "Pie Preferido:"};
        
        // Inicialización de los componentes modificados

        // Fila 1 (Nombre, Nacionalidad)
        txtNombre = new JTextField(15);
        cmbNacionalidad = new JComboBox<>(new String[]{"Argentina", "Portugal", "Bélgica", "Brasil", "Marruecos", "España", "Alemania"});

        // Fila 2 (Peso, F. Nacimiento)
        txtPeso = new JTextField(10);
        // Usamos JTextField para mantener el formato de texto YYYY-MM-DD fácil de leer
        txtFechaNacimiento = new JTextField(10); 
        
        // Fila 3 (Posición, Pie Preferido)
        cmbPosicion = new JComboBox<>(new String[]{"Delantero", "Mediocentro", "Portero", "Defensa"});
        cmbPie = new JComboBox<>(new String[]{"Derecho", "Izquierdo"});

        // Fila 4 (Rating)
        // JSpinner para el Rating (1-99)
        spinRating = new JSpinner(new SpinnerNumberModel(90, 1, 99, 1)); 
        JSpinner.NumberEditor ratingEditor = new JSpinner.NumberEditor(spinRating, "0");
        spinRating.setEditor(ratingEditor);

        // Arreglo de componentes en el orden de las etiquetas
        // Los indices ya no coinciden con los indices de Estudiante, se reordenan
        inputFields = new JComponent[]{
            txtNombre, // 0
            txtPeso, // 1
            cmbPosicion, // 2
            spinRating, // 3
            cmbNacionalidad, // 4
            txtFechaNacimiento, // 5
            cmbPie // 6
        };

        // Arreglo de JLabels
        JLabel[] jLabels = new JLabel[labels.length];
        for(int i = 0; i < labels.length; i++) {
            jLabels[i] = new JLabel(labels[i]);
        }
        
        // Colocación de componentes en 2 columnas (parecido al diseño de la imagen)

        // Columna 1 (Nombre, Peso, Posición, Rating)
        // Posiciones: 0, 1, 2, 3
        for (int i = 0; i < 4; i++) {
            gbc.gridx = 0; // Columna de etiqueta (izquierda)
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST;
            panel.add(jLabels[i], gbc);

            gbc.gridx = 1; // Columna de campo (centro)
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(inputFields[i], gbc);
        }

        // Columna 2 (Nacionalidad, F. Nacimiento, Pie Preferido)
        // Posiciones: 4, 5, 6
        for (int i = 4; i < labels.length; i++) {
            gbc.gridx = 2; // Columna de etiqueta (centro-derecha)
            gbc.gridy = i - 4; // Fila relativa a la columna 1
            gbc.anchor = GridBagConstraints.WEST;
            panel.add(jLabels[i], gbc);

            gbc.gridx = 3; // Columna de campo (derecha)
            gbc.gridy = i - 4;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(inputFields[i], gbc);
        }

        return panel;
    }

    private JPanel crearButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Los botones se mantienen iguales, pero agregamos el atajo para Nuevo (Ctrl+I)

        btnEditar = new JButton("Editar");
        btnEditar.addActionListener(e -> accionEditar());
        
        btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(e -> accionNuevo());
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> accionGuardar());
        
        btnAnterior = new JButton("Anterior");
        btnAnterior.addActionListener(e -> accionAnterior());
        
        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> accionSiguiente());
        
        btnEstadisticas = new JButton("Estadística");
        btnEstadisticas.addActionListener(e -> accionEstadisticas());

        panel.add(btnEditar);
        panel.add(btnNuevo);
        panel.add(btnGuardar);
        panel.add(btnAnterior);
        panel.add(btnSiguiente);
        panel.add(btnEstadisticas);

        return panel;
    }
    
    // --- Lógica de Componentes ---

    // Nuevo método para configurar las teclas globales (incluyendo Ctrl+I)
    private void configurarTeclasGlobales() {
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getRootPane().getActionMap();

        // Hotkey: Ctrl+I para Nuevo Registro
        KeyStroke nuevoKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK);
        inputMap.put(nuevoKeyStroke, "accionNuevo");
        actionMap.put("accionNuevo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!modoEdicion) {
                    accionNuevo();
                    JOptionPane.showMessageDialog(AppJugador.this, "Atajo: Ctrl + I - Nuevo Registro", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    // Modificado: Se usa Jugador en lugar de Estudiante, y se actualizan los campos mostrados
    private void cargarDatosEnTabla(ArrayList<Jugador> datos) {
        tableModel.setRowCount(0); 
        if (datos != null) {
            listaJugadores = datos;
            for (Jugador j : datos) {
                tableModel.addRow(new Object[]{
                    j.getNombre(), 
                    j.getNacionalidad(), 
                    j.getPeso(),
                    j.getFechaNacimiento(),
                    j.getPosicion(),
                    j.getPie(),
                    j.getRating()
                });
            }
        } else {
            listaJugadores = new ArrayList<>();
        }
        itemBorrar.setEnabled(!listaJugadores.isEmpty()); // Habilitar/deshabilitar borrar
    }
    
    // Se mantiene la lógica de habilitación, ahora aplicada a los 7 campos de Jugador
    private void habilitarPanelDatos(boolean habilitar) {
        for (Component comp : inputFields) {
            comp.setEnabled(habilitar);
        }
        btnGuardar.setEnabled(habilitar);
        modoEdicion = habilitar;
        
        btnEditar.setEnabled(!habilitar && !listaJugadores.isEmpty() && registroActual != -1);
        btnNuevo.setEnabled(!habilitar);
        
        if (!habilitar) {
            actualizarEstadoNavegacion();
        } else {
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
    }
    
    // Modificado: Mostrar los campos de Jugador
    private void mostrarRegistroActual() {
        if (registroActual >= 0 && registroActual < listaJugadores.size()) {
            Jugador j = listaJugadores.get(registroActual);
            
            // Campos (ver orden de inputFields en crearInputPanel)
            txtNombre.setText(j.getNombre());
            txtPeso.setText(String.valueOf(j.getPeso()));
            cmbPosicion.setSelectedItem(j.getPosicion());
            spinRating.setValue(j.getRating());
            
            cmbNacionalidad.setSelectedItem(j.getNacionalidad());
            // Formato YYYY-MM-DD
            txtFechaNacimiento.setText(j.getFechaNacimiento().toString()); 
            cmbPie.setSelectedItem(j.getPie());
            
            // Actualizar selección en la tabla
            table.setRowSelectionInterval(registroActual, registroActual);
        } else {
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPeso.setText("");
        cmbPosicion.setSelectedIndex(0);
        spinRating.setValue(90);
        cmbNacionalidad.setSelectedIndex(0);
        txtFechaNacimiento.setText(LocalDate.now().toString());
        cmbPie.setSelectedIndex(0);
    }
    
    private void actualizarEstadoNavegacion() {
        if (listaJugadores.isEmpty()) {
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
            btnEditar.setEnabled(false); // No se puede editar si no hay registros
            return;
        }
        btnEditar.setEnabled(true);
        btnAnterior.setEnabled(registroActual > 0);
        btnSiguiente.setEnabled(registroActual < listaJugadores.size() - 1);
    }
    
    // Modificado: Obtener objeto Jugador desde campos
    private Jugador obtenerJugadorDesdeCampos() {
        try {
            String nombre = txtNombre.getText();
            String nacionalidad = (String) cmbNacionalidad.getSelectedItem();
            float peso = Float.parseFloat(txtPeso.getText());
            String posicion = (String) cmbPosicion.getSelectedItem();
            String pie = (String) cmbPie.getSelectedItem();
            int rating = (Integer) spinRating.getValue();

            // Validación de fecha
            LocalDate fechaNacimiento;
            try {
                 fechaNacimiento = LocalDate.parse(txtFechaNacimiento.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "El formato de la Fecha de Nacimiento debe ser YYYY-MM-DD.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            return new Jugador(nombre, nacionalidad, peso, fechaNacimiento, posicion, pie, rating);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en formato numérico (Peso o Rating).", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // --- Acciones de Botones y Menús ---

    private void accionEditar() {
        if (registroActual != -1) {
            habilitarPanelDatos(true);
        }
    }

    private void accionNuevo() {
        limpiarCampos();
        habilitarPanelDatos(true);
        registroActual = -1; // -1 indica nuevo registro
    }

    private void accionGuardar() {
        // Modificado: Usar Jugador
        Jugador nuevoOEditado = obtenerJugadorDesdeCampos();
        if (nuevoOEditado == null) return;
        
        if (registroActual == -1) {
            listaJugadores.add(nuevoOEditado);
            registroActual = listaJugadores.size() - 1;
            JOptionPane.showMessageDialog(this, "Nuevo jugador agregado.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            listaJugadores.set(registroActual, nuevoOEditado);
            JOptionPane.showMessageDialog(this, "Jugador editado y guardado.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        cargarDatosEnTabla(listaJugadores);
        mostrarRegistroActual();
        habilitarPanelDatos(false);
    }
    
    // Agregado: Función para borrar un registro con Confirmación
    private void accionBorrar() {
        if (registroActual >= 0 && registroActual < listaJugadores.size()) {
            Jugador jugadorABorrar = listaJugadores.get(registroActual);
            
            // Confirmación
            int opcion = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea borrar a " + jugadorABorrar.getNombre() + "?", 
                "Confirmar Borrado", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
            
            if (opcion == JOptionPane.YES_OPTION) {
                listaJugadores.remove(registroActual);
                cargarDatosEnTabla(listaJugadores);
                
                // Actualizar índice después de borrar
                if (!listaJugadores.isEmpty()) {
                    registroActual = Math.min(registroActual, listaJugadores.size() - 1);
                } else {
                    registroActual = -1;
                }
                
                mostrarRegistroActual();
                actualizarEstadoNavegacion();
                JOptionPane.showMessageDialog(this, jugadorABorrar.getNombre() + " ha sido borrado.", "Borrado Exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para borrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void accionAnterior() {
        if (registroActual > 0) {
            registroActual--;
            mostrarRegistroActual();
            actualizarEstadoNavegacion();
        }
    }

    private void accionSiguiente() {
        if (registroActual < listaJugadores.size() - 1) {
            registroActual++;
            mostrarRegistroActual();
            actualizarEstadoNavegacion();
        }
    }

    private void accionAbrir() {
        JFileChooser fileChooser = new JFileChooser();
        // Modificado: Nombre de archivo sugerido
        fileChooser.setSelectedFile(new File("jugadores_fifa.ser")); 
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                // Modificado: Usar Jugador
                ArrayList<Jugador> datos = utilidad.leerDatos(archivo.getAbsolutePath()); 
                if (datos != null) {
                    cargarDatosEnTabla(datos);
                    registroActual = datos.isEmpty() ? -1 : 0;
                    mostrarRegistroActual();
                    actualizarEstadoNavegacion();
                    JOptionPane.showMessageDialog(this, "Datos de jugadores cargados correctamente.", "Abrir", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo está vacío o el formato es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void accionGrabar() {
        JFileChooser fileChooser = new JFileChooser();
        // Modificado: Nombre de archivo sugerido
        fileChooser.setSelectedFile(new File("jugadores_fifa.ser")); 
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                // Modificado: Usar Jugador
                utilidad.grabarDatos(archivo.getAbsolutePath(), listaJugadores); 
                JOptionPane.showMessageDialog(this, "Datos de jugadores guardados correctamente.", "Grabar", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Modificado: Mensaje de Acerca de
    private void accionAcercaDe() {
        JOptionPane.showMessageDialog(this, 
            "Aplicación de Gestión de Jugadores FIFA\nVersión 2.0\nProgramador: Gemini AI (Modificado por Carlos)", 
            "Acerca de", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Agregado: Mensaje de Teclas
    private void accionTeclas() {
        String mensaje = "<html><h2>Teclas de Acceso Rápido</h2>"
            + "<b>Menú:</b><br>"
            + "&nbsp;&nbsp;&nbsp;&nbsp; - **Ctrl + A:** Abrir archivo<br>"
            + "&nbsp;&nbsp;&nbsp;&nbsp; - **Ctrl + G:** Grabar archivo<br>"
            + "<b>Tabla (mientras esté seleccionada):</b><br>"
            + "&nbsp;&nbsp;&nbsp;&nbsp; - **Ctrl + D:** Borrar registro seleccionado<br>"
            + "&nbsp;&nbsp;&nbsp;&nbsp; - **Ctrl + I:** Iniciar nuevo registro"
            + "</html>";

        JOptionPane.showMessageDialog(this, 
            mensaje, 
            "Ayuda - Teclas", 
            JOptionPane.INFORMATION_MESSAGE);
    }

    // Modificado: Se calcula Rating, Peso y se agrupa por Nacionalidad/Posición
    private void accionEstadisticas() {
        if (listaJugadores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos para mostrar estadísticas.", "Estadísticas", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Cálculos
        int totalJugadores = listaJugadores.size();
        double promedioRating = listaJugadores.stream().mapToInt(Jugador::getRating).average().orElse(0.0);
        double promedioPeso = listaJugadores.stream().mapToDouble(Jugador::getPeso).average().orElse(0.0);
        
        // Agrupación por Nacionalidad y Posición (similar a los ejemplos de Estudiante)
        String nacionalidades = listaJugadores.stream()
            .map(Jugador::getNacionalidad)
            .distinct()
            .collect(Collectors.joining(", "));
            
        String posiciones = listaJugadores.stream()
            .map(Jugador::getPosicion)
            .distinct()
            .collect(Collectors.joining(", "));


        String estadisticas = String.format(
            "<html><h2>Estadísticas de Jugadores FIFA</h2>" +
            "<b>Total Jugadores:</b> %d<br>" +
            "<b>Promedio de Rating (1-99):</b> %.2f<br>" +
            "<b>Promedio de Peso:</b> %.2f kg<br>" +
            "<b>Nacionalidades Representadas:</b> %s<br>" +
            "<b>Posiciones Únicas:</b> %s</html>",
            totalJugadores, promedioRating, promedioPeso, nacionalidades, posiciones
        );

        JOptionPane.showMessageDialog(this, estadisticas, "Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AppJugador().setVisible(true);
        });
    }
}