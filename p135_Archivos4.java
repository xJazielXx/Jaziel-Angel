import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class p135_Archivos4 {
    public static void capturaDatos( ArrayList<String>datos){
        String dato="";
        System.out.println("\n Indtroduce un dato y presiona <Enter> dato para terminar> ");
        while(true){
            dato = new Scanner(System.in).nextLine();
            if(!dato.isEmpty()) datos.add(dato);
            else break;
            
        }

    }
    public static void grabarDatos(String archivo, ArrayList<String>datos)throws IOException{
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for(String dato: datos)
        fdatos.write(dato + "\n");
        fdatos.close();
    }
    public static static ArrayList<String> leerDatos(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while((dato=fdatos.readLine())!=null)
        datos.add(dato);

        fdatos.close();
        return datos;



    
}
public static void mostrarDatos(ArrayList<String> datos){
    System.out.println("\nLos datos hasta el momento:");
for (String dato : datos) {

    }
}
public static void main(String[] args) {
    int op;
    Scanner obj= new Scanner(System.in);
    String archivo= "datos.txt";
    ArrayList<String> datos = new ArrayList<>();

    do{
                    System.out.print("\033[H\033[2J");
            System.out.println("----- Procesamiento de datos ---------------");
            System.out.println("Capturar datos ....................... [ 1 ]");
            System.out.println("Grabar datos en archivo ........... [ 2 ]");
            System.out.println("Leer datos de archivo ............ [ 3 ]");
            System.out.println("Mostrar datos .......... ............ [ 4 ]");
            System.out.println("Salir ................................ [ 5 ]");
            System.out.print("Elije opcion ? "); op = obj.nextInt();

            switch (op) {
                case 1:
                            if(datos.size()==0) System.out.println("\nSe capturan datos por primera vez\n");
                            else System.out.println("\nLos datos a capturar se agregan a los datos existentes\n");
                            capturaDatos(datos);

                            break;

    
    case 2:
                    try {
                        if(datos.size()!=0) {
                            grabarDatos(archivo, datos);
                            System.out.println("\nDatos grabados correctamente ..");
                        } else System.out.println("\nNo hay datos para grabar, captura datos antes");
                        } catch (Exception e) {
                            System.out.println("\nError al grabar los datos en el archivo");
                        } break;

    case 3:
                    try {
                            datos = leerDatos(archivo);
                            System.out.println("\nDatos cargados correctamente ..");
                        } catch (Exception e) {
                            System.out.println("\nError al leer archivo");
                        } break;
    case 4:
                    if(datos.size()!=0)
                                mostrarDatos(datos);
                            else System.out.println("\nNo hay datos para mostrar, captura datos o lee datos del disco");
                            break;
    case 5:
                    System.out.println("\nSaliendo del sistema .... \n"); break;
                    default:
                    System.out.println("Opcion inválida");
                    break;



                    }
                    System.out.println("\n<Presiona Cualquier tecla para Continuar>");obj.nextLine();obj.nextLine();
                    } while (op!=5);

}
}


