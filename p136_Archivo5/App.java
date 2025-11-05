package p136_Archivo5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void capturarDatos(ArrayList<Persona> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de una Persona (Nombre vacio para terminar)");
        
        while (true) {
            Persona persona = new Persona();
            System.out.print("Nombre: ");
            String nombre = obj.nextLine();
            
            if (nombre.isEmpty()) break;
            
            persona.setNombre(nombre);
            System.out.print("Edad: ");
            persona.setEdad(obj.nextInt());
            System.out.print("Peso: ");
            persona.setPeso(obj.nextDouble());
            obj.nextLine(); // Limpiar buffer
            System.out.print("Correo: ");
            persona.setCorreo(obj.nextLine());
            
            datos.add(persona);
            System.out.println("Persona agregada correctamente.\n");
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fdatos = new ObjectOutputStream(arch);
        fdatos.writeObject(datos);
        fdatos.close();
        System.out.println("Datos grabados correctamente en: " + archivo);
    }

    public static ArrayList<Persona> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fdatos = new ObjectInputStream(arch);
        @SuppressWarnings("unchecked")
        ArrayList<Persona> datos = (ArrayList<Persona>) fdatos.readObject();
        fdatos.close();
        return datos;
    }

    public static void mostrarDatos(ArrayList<Persona> datos) {
        if (datos.isEmpty()) {
            System.out.println("\nNo hay datos para mostrar.");
            return;
        }
        
        System.out.println("\nLos datos hasta el momento:");
        System.out.println("----------------------------");
        for (int i = 0; i < datos.size(); i++) {
            System.out.println((i + 1) + ". " + datos.get(i));
        }
        System.out.println("Total de registros: " + datos.size());
    }

    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "datos.dat";
        ArrayList<Persona> datos = new ArrayList<>();
        
        do {
            System.out.println("\n=== PROCESAMIENTO DE DATOS DE PERSONAS ===");
            System.out.println("Capturar Datos.............[1]");
            System.out.println("Grabar Datos...............[2]");
            System.out.println("Leer Datos.................[3]");
            System.out.println("Mostrar Datos.............[4]");
            System.out.println("Salir......................[5]");
            System.out.print("Elige una opción: ");
            
            op = obj.nextInt();
            obj.nextLine(); // Limpiar buffer
            
            switch (op) {
                case 1:
                    if (datos.isEmpty()) {
                        System.out.println("Captura inicial...");
                    } else {
                        System.out.println("Los datos se agregarán a los ya existentes");
                    }
                    capturarDatos(datos);
                    break;
                    
                case 2:
                    try {
                        if (!datos.isEmpty()) {
                            grabarDatos(archivo, datos);
                        } else {
                            System.out.println("\nNo hay datos para grabar, captura datos antes.");
                        }
                    } catch (Exception e) {
                        System.out.println("\nError al grabar los datos en el archivo: " + e.getMessage());
                    }
                    break;
                    
                case 3:
                    try {
                        datos = leerDatos(archivo);
                        System.out.println("\nDatos cargados correctamente desde: " + archivo);
                    } catch (Exception e) {
                        System.out.println("\nError al leer archivo: " + e.getMessage());
                    }
                    break;
                    
                case 4:
                    if (!datos.isEmpty()) {
                        mostrarDatos(datos);
                    } else {
                        System.out.println("\nNo hay datos para mostrar, captura datos o lee datos del disco.");
                    }
                    break;
                    
                case 5:
                    System.out.println("\nSaliendo del sistema...\n");
                    break;
                    
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            
            if (op != 5) {
                System.out.print("\nPresiona Enter para continuar...");
                obj.nextLine();
            }
            
        } while (op != 5);
        
        obj.close();
    }
}