import java.util.Scanner;

public class p027_AceptarEstudiante {

    public static void main(String [] args ) { 
        String nombre;
        int edad;
        float cal1, cal2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Acepta a un estudiante con sus calificaciones y su edad");

        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        System.out.print("Dame tu nombre ? "); 
        nombre = obj.nextLine();
                
        System.out.print("Dame la edad ? "); 
        edad = obj.nextInt();

if( edad >= 18 ) {
       System.out.println("Eres mayor de edad, continuamos ");

       System.out.println("Dame dos calificaciones separadas por Enter:");
        cal1 = obj.nextFloat();
        cal2 = obj.nextFloat();

if( cal1 >= 8 && cal2 >= 8)
       System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,cal1,cal2);

else
       System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");

}
else

       System.out.println("Solo aceptamos estudiantes mayores de edad");

       System.out.println("\nProceso terminado ...");





    }



    
}
