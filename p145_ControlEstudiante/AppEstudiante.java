
package p145_ControlEstudiante;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class AppEstudiante extends JFrame {

    private final Utileria utilidad = new Utileria();
    private ArrayList<Estudiante> listaEstudiantes;
    private DefaultTableModel tableModel;
    private JPanel formPanel;
    private JComponent[] inputFields;
    
    // Variables de estado para la navegación y edición
    private int registroActual = -1; 
    private boolean modoEdicion = false; 

    // Botones
    private JButton btnEditar;
    private JButton btnNuevo;
    private JButton btnGuardar;
    private JButton btnAnterior;
    private JButton btnSiguiente;

    public AppEstudiante() {
        super("Aplicacion de Gestion de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); 

        // 1. Crear Barra de Menús
        setJMenuBar(crearBarraMenu());

        // 2. Panel Superior: JTable dentro de JScrollPane
        JScrollPane scrollPane = crearTablaPanel();
        add(scrollPane, BorderLayout.CENTER);

        // 3. Panel Inferior: Formulario de Entrada de Datos y Botones
        JPanel bottomPanel = new JPanel(new BorderLayout());
        formPanel = crearInputPanel();
        bottomPanel.add(formPanel, BorderLayout.CENTER);
        
        JPanel buttonContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonContainer.add(crearButtonPanel());
        bottomPanel.add(buttonContainer, BorderLayout.SOUTH);
        
        add(bottomPanel, BorderLayout.SOUTH);
        
        // --- FUNCIONALIDAD DE INICIO ---
        listaEstudiantes = utilidad.inicializar();
        cargarDatosEnTabla(listaEstudiantes);
        
        habilitarPanelDatos(false);
        // Mostrar el primer registro si existe
        if (!listaEstudiantes.isEmpty()) {
            registroActual = 0;
            mostrarRegistroActual();
        }
        actualizarEstadoNavegacion();

        pack(); 
        setSize(Math.max(600, getWidth()), Math.max(500, getHeight())); 
        setLocationRelativeTo(null); 
    }

    // --- Métodos de Creación de Componentes ---

    private JMenuBar crearBarraMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(e -> accionAbrir());
        menuArchivo.add(itemAbrir);

        JMenuItem itemGrabar = new JMenuItem("Grabar");
        itemGrabar.addActionListener(e -> accionGrabar());
        menuArchivo.add(itemGrabar);
        
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0));
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de..");
        itemAcercaDe.addActionListener(e -> accionAcercaDe());
        menuAyuda.add(itemAcercaDe);

        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        
        return menuBar;
    }

    private JScrollPane crearTablaPanel() {
        String[] columnNames = {"Nombre", "Edad", "Promedio", "Sexo"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }; 
        JTable table = new JTable(tableModel);
        
        // Listener para la selección de fila
        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1 && !modoEdicion) {
                registroActual = table.getSelectedRow();
                mostrarRegistroActual();
                table.setRowSelectionInterval(registroActual, registroActual);
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

        String[] labels = {"Nombre (string):", "Edad (Int):", "Peso (float):", "Correo (string):", 
                           "FechaNacimiento (DateTime):", "Sexo (String):", "Promedio (float):"};
        inputFields = new JComponent[labels.length];

        inputFields[0] = new JTextField(20);
        inputFields[1] = new JSpinner(new SpinnerNumberModel(20, 0, 150, 1));
        inputFields[2] = new JTextField(10);
        inputFields[3] = new JTextField(20);
        
        inputFields[4] = new JSpinner(new SpinnerDateModel()); 
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor((JSpinner)inputFields[4], "yyyy-MM-dd");
        ((JSpinner)inputFields[4]).setEditor(dateEditor);
        
        String[] sexOptions = {"Masculino", "Femenino"};
        inputFields[5] = new JComboBox<>(sexOptions); 
        
        inputFields[6] = new JTextField(10);

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST;
            panel.add(new JLabel(labels[i]), gbc);

            gbc.gridx = 1;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(inputFields[i], gbc);
        }

        return panel;
    }

    private JPanel crearButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

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
        
        JButton btnEstadisticas = new JButton("Estadística");
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

    private void cargarDatosEnTabla(ArrayList<Estudiante> datos) {
        tableModel.setRowCount(0); 
        if (datos != null) {
            listaEstudiantes = datos;
            for (Estudiante e : datos) {
                tableModel.addRow(new Object[]{
                    e.getNombre(), 
                    e.getEdad(), 
                    e.getPromedio(),
                    e.getSexo()
                });
            }
        } else {
            listaEstudiantes = new ArrayList<>();
        }
    }
    
    private void habilitarPanelDatos(boolean habilitar) {
        for (Component comp : inputFields) {
            comp.setEnabled(habilitar);
        }
        btnGuardar.setEnabled(habilitar);
        modoEdicion = habilitar;
        
        btnEditar.setEnabled(!habilitar && !listaEstudiantes.isEmpty());
        btnNuevo.setEnabled(!habilitar);
        
        if (!habilitar) {
            actualizarEstadoNavegacion();
        } else {
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
        }
    }
    
    private void mostrarRegistroActual() {
        if (registroActual >= 0 && registroActual < listaEstudiantes.size()) {
            Estudiante e = listaEstudiantes.get(registroActual);
            
            ((JTextField)inputFields[0]).setText(e.getNombre());
            ((JSpinner)inputFields[1]).setValue(e.getEdad());
            ((JTextField)inputFields[2]).setText(String.valueOf(e.getPeso()));
            ((JTextField)inputFields[3]).setText(e.getCorreo());
            
            if (e.getFechaNacimiento() != null) {
                Date date = Date.from(e.getFechaNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant());
                ((JSpinner)inputFields[4]).setValue(date);
            }
            
            ((JComboBox<String>)inputFields[5]).setSelectedItem(e.getSexo());
            ((JTextField)inputFields[6]).setText(String.valueOf(e.getPromedio()));
            
            // Actualizar selección en la tabla
            JTable table = (JTable)((JScrollPane)getContentPane().getComponent(0)).getViewport().getView();
            table.setRowSelectionInterval(registroActual, registroActual);
        }
    }

    private void limpiarCampos() {
        ((JTextField)inputFields[0]).setText("");
        ((JSpinner)inputFields[1]).setValue(20);
        ((JTextField)inputFields[2]).setText("");
        ((JTextField)inputFields[3]).setText("");
        ((JSpinner)inputFields[4]).setValue(new Date());
        ((JComboBox<String>)inputFields[5]).setSelectedIndex(0);
        ((JTextField)inputFields[6]).setText("");
    }
    
    private void actualizarEstadoNavegacion() {
        if (listaEstudiantes.isEmpty()) {
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
            return;
        }
        btnAnterior.setEnabled(registroActual > 0);
        btnSiguiente.setEnabled(registroActual < listaEstudiantes.size() - 1);
    }
    
    private Estudiante obtenerEstudianteDesdeCampos() {
        try {
            String nombre = ((JTextField)inputFields[0]).getText();
            int edad = (Integer) ((JSpinner)inputFields[1]).getValue();
            float peso = Float.parseFloat(((JTextField)inputFields[2]).getText());
            String correo = ((JTextField)inputFields[3]).getText();
            
            Date date = (Date) ((JSpinner)inputFields[4]).getValue();
            LocalDate fechaNacimiento = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            String sexo = (String) ((JComboBox<?>)inputFields[5]).getSelectedItem();
            float promedio = Float.parseFloat(((JTextField)inputFields[6]).getText());

            return new Estudiante(nombre, edad, peso, correo, fechaNacimiento, sexo, promedio);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en formato numérico (Peso o Promedio).", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // --- Acciones de Botones ---

    private void accionEditar() {
        habilitarPanelDatos(true);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
    }

    private void accionNuevo() {
        limpiarCampos();
        habilitarPanelDatos(true);
        btnEditar.setEnabled(false);
        registroActual = -1;
    }

    private void accionGuardar() {
        Estudiante nuevoOEditado = obtenerEstudianteDesdeCampos();
        if (nuevoOEditado == null) return;
        
        if (registroActual == -1) {
            listaEstudiantes.add(nuevoOEditado);
            registroActual = listaEstudiantes.size() - 1;
            JOptionPane.showMessageDialog(this, "Nuevo estudiante agregado.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            listaEstudiantes.set(registroActual, nuevoOEditado);
            JOptionPane.showMessageDialog(this, "Estudiante editado y guardado.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        cargarDatosEnTabla(listaEstudiantes);
        mostrarRegistroActual();
        habilitarPanelDatos(false);
    }

    private void accionAnterior() {
        if (registroActual > 0) {
            registroActual--;
            mostrarRegistroActual();
            actualizarEstadoNavegacion();
        }
    }

    private void accionSiguiente() {
        if (registroActual < listaEstudiantes.size() - 1) {
            registroActual++;
            mostrarRegistroActual();
            actualizarEstadoNavegacion();
        }
    }

    // --- Métodos Faltantes que debes implementar ---

    private void accionAbrir() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                ArrayList<Estudiante> datos = utilidad.leerDatos(archivo.getAbsolutePath());
                cargarDatosEnTabla(datos);
                registroActual = datos.isEmpty() ? -1 : 0;
                mostrarRegistroActual();
                actualizarEstadoNavegacion();
                JOptionPane.showMessageDialog(this, "Datos cargados correctamente.", "Abrir", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void accionGrabar() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                utilidad.grabarDatos(archivo.getAbsolutePath(), listaEstudiantes);
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente.", "Grabar", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void accionAcercaDe() {
        JOptionPane.showMessageDialog(this, 
            "Aplicación de Gestión de Estudiantes\nVersión 1.0\nDesarrollado con Java Swing", 
            "Acerca de", 
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void accionEstadisticas() {
        if (listaEstudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos para mostrar estadísticas.", "Estadísticas", JOptionPane.WARNING_MESSAGE);
            return;
        }

        long hombres = listaEstudiantes.stream().filter(e -> "Masculino".equals(e.getSexo())).count();
        long mujeres = listaEstudiantes.size() - hombres;
        double promedioEdad = listaEstudiantes.stream().mapToInt(Estudiante::getEdad).average().orElse(0.0);
        double promedioGeneral = listaEstudiantes.stream().mapToDouble(Estudiante::getPromedio).average().orElse(0.0);

        String estadisticas = String.format(
            "<html><h2>Estadísticas Generales</h2>" +
            "<b>Total Estudiantes:</b> %d<br>" +
            "<b>Hombres:</b> %d<br>" +
            "<b>Mujeres:</b> %d<br>" +
            "<b>Promedio de Edad:</b> %.2f años<br>" +
            "<b>Promedio General:</b> %.2f</html>",
            listaEstudiantes.size(), hombres, mujeres, promedioEdad, promedioGeneral
        );

        JOptionPane.showMessageDialog(this, estadisticas, "Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AppEstudiante().setVisible(true);
        });
    }
}