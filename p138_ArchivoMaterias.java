import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class p138_ArchivoMaterias {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<String> materias = new ArrayList<>();
        
        try {
            
            System.out.println("Ingrese las materias");
            System.out.println("(Escriba 'fin' para terminar)");
            
            int contador = 1;
            while (true) {
                System.out.print("Materia " + contador + ": ");
                String materia = obj.nextLine();
                
                if (materia.equalsIgnoreCase("fin")) {
                    break;
                }
                
                if (!materia.trim().isEmpty()) {
                    materias.add(materia);
                    contador++;
                }
            }
            
            
            File archivo = new File("Materias.txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                for (String materia : materias) {
                    writer.write(materia);
                    writer.newLine();
                }
                
            }
            
           
            System.out.println("\nContenido:");
            
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                int numero = 1;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(numero + ". " + linea);
                    numero++;
                }
                
                System.out.println("Total: " + (numero - 1) + " materias");
            }
            
        } catch (FileNotFoundException e) {
            System.err.println(" Problemas al procesar el archivo- " + e.getMessage());
        } catch (IOException e) {
            System.err.println(" Error de entrada/salida - " + e.getMessage());
        } catch (Exception e) {
            System.err.println(" Error inesperado - " + e.getMessage());
        } finally {
            obj.close();
        }
    }
}



