import java.io.*;

public class p137_ArchivoMunicipios  {
    public static void main(String[] args) {
        try {
            String[] deportes = {"beisbol", "futbol", "Ciclismo", "Atletismo", "Natacion", "Motociclismo"};
            
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("deportes.txt"));
            for (String deporte : deportes) bw.write(deporte + "\n");
            bw.close();
            
            System.out.println("Datos escritos correctamente\n\nDeportes:");
            
            // mostrar
            BufferedReader br = new BufferedReader(new FileReader("deportes.txt"));
            String linea;
            while ((linea = br.readLine()) != null) System.out.println(linea);
            br.close();
            
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo");
        }
    }
}