import java.util.Scanner;

public class p091_MayoresPromedio {

    public static float[] CapturaCalificaciones(){
        Scanner obj = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones quieres ingresar? ");
        int cantidad = obj.nextInt();

        float[] calificaciones = new float[cantidad];
        
        System.out.println("\nIngresa las calificaciones:");
        for(int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = obj.nextFloat();
        }
        
        return calificaciones;
    }
    
    public static void mostrarMayoresAlPromedio(float[] calificaciones, float promedio) {
        System.out.println("\n CALIFICACIONES SOBRE EL PROMEDIO ");
        System.out.printf("El limite es 7.00");
        System.out.println("Calificaciones aprobadas:");
        
        int contador = 0;
        
        for(int i = 0; i < calificaciones.length; i++) {
            if(calificaciones[i] > 7.0f) {
                System.out.printf("Estudiante %d: %.2f\n", (i + 1), calificaciones[i]);
                contador++;
            }
        }
        

        System.out.println("Total de calificaciones que si pasan: " + contador);
        
        
    }
    
    public static void main(String[] args) {
        float[] califs = CapturaCalificaciones();
        
        System.out.println("\n CALIFICACIONES CAPTURADAS ");
        for(int i = 0; i < califs.length; i++) {
            System.out.printf("Estudiante %d: %.2f\n", (i + 1), califs[i]);
        }
        
        // Calcular el promedio
        float suma = 0;
        for(float calif : califs) {
            suma += calif;
        }
        float promedio = suma / califs.length;
        System.out.printf("\nPromedio del grupo: %.2f\n", promedio);
        
        // Llamar a la nueva función
        mostrarMayoresAlPromedio(califs, promedio);
    }
}