package p146_Fifa;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Utileria {

    // Archivo por defecto para la carga inicial
    private static final String DEFAULT_FILE_NAME = "jugadores.dat"; 

    /**
     * Graba la lista de jugadores a un archivo usando Serialización.
     * Lanza IOException para que el llamador (AppJugador) maneje el error.
     */
    public void grabarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        // Se usa try-with-resources, pero NO se captura la excepción, se Lanza.
        try (FileOutputStream fileOut = new FileOutputStream(archivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(datos);
        } 
        // Nota: La cláusula 'catch' se remueve o el IDE la puede sugerir
        // como innecesaria ya que declaramos 'throws IOException'.
    }

    /**
     * Lee la lista de jugadores desde un archivo usando Serialización.
     * Lanza IOException y ClassNotFoundException para manejo externo.
     */
    public ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        // Se usa try-with-resources, pero NO se captura la excepción, se Lanza.
        try (FileInputStream fileIn = new FileInputStream(archivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            // Suprimimos la advertencia de tipo no verificado
            @SuppressWarnings("unchecked")
            ArrayList<Jugador> datos = (ArrayList<Jugador>) objectIn.readObject();
            return datos;
        }
    }
    
    /**
     * Intenta cargar el archivo por defecto. Si el archivo no existe o hay un error, 
     * devuelve una lista con datos de ejemplo.
     */
    public ArrayList<Jugador> inicializar() {
        File file = new File(DEFAULT_FILE_NAME);
        
        if (file.exists()) {
            try {
                // Intenta cargar si existe el archivo
                return leerDatos(DEFAULT_FILE_NAME); 
            } catch (IOException | ClassNotFoundException e) {
                // Si el archivo existe pero está corrupto o hay un error de lectura,
                // imprime el error y cae a devolver la lista de ejemplo.
                System.err.println("Error al cargar datos guardados. Usando lista de ejemplo: " + e.getMessage());
            }
        }
        
        // --- Generar lista de ejemplo si no se pudo cargar ---
        ArrayList<Jugador> listaEjemplo = new ArrayList<>();
        listaEjemplo.add(new Jugador("Lionel Messi", "Argentina", 67.0f, LocalDate.of(1987, 6, 24), "Delantero", "Izquierdo", 90));
        listaEjemplo.add(new Jugador("Cristiano Ronaldo", "Portugal", 83.0f, LocalDate.of(1985, 2, 5), "Delantero", "Derecho", 86));
        listaEjemplo.add(new Jugador("Kevin De Bruyne", "Bélgica", 70.0f, LocalDate.of(1991, 6, 28), "Mediocentro", "Derecho", 91));
        listaEjemplo.add(new Jugador("Alisson Becker", "Brasil", 91.0f, LocalDate.of(1992, 10, 2), "Portero", "Derecho", 89));
        listaEjemplo.add(new Jugador("Achraf Hakimi", "Marruecos", 73.0f, LocalDate.of(1998, 11, 4), "Defensa", "Derecho", 84));

        return listaEjemplo;
    }
}