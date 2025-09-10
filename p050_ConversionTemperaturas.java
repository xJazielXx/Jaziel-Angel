import java.util.Scanner;

/*
 Corrige: tabla de conversión Celsius -> Fahrenheit
  - valida rango (fin >= ini)
  - usa double para el resultado
  - corrige división entera (9.0/5.0)
  - formatea salida con 2 decimales
  - valida respuesta S/N y cierra el Scanner
*/
public class p050_ConversionTemperaturas {
    public static void main(String[] args) {
        int ini, fin;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("Imprime la tabla de conversión grados\n");

            // Pedir inicio/fin y validar que fin >= ini
            do {
                System.out.print("Inicio (°C): ");
                ini = obj.nextInt();
                System.out.print("Fin (°C): ");
                fin = obj.nextInt();
                if (fin < ini) {
                    System.out.println("Error: El valor final no puede ser menor que el inicial. Intenta de nuevo.\n");
                }
            } while (fin < ini);

            System.out.println("\nCentígrados\tFahrenheit");
            for (int c = ini; c <= fin; c++) {
                double fahrenheit = (c * 9.0 / 5.0) + 32.0; // usa c y 9.0/5.0 para evitar división entera
                System.out.printf("%d\t\t%.2f\n", c, fahrenheit);
            }

            System.out.print("\n¿Deseas continuar? (S/N): ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            while (resp != 'S' && resp != 'N') {
                System.out.print("Respuesta no válida. Escribe S o N: ");
                resp = Character.toUpperCase(obj.next().charAt(0));
            }

        } while (resp != 'N');

        System.out.println("\nGracias por utilizar este programa!");
        obj.close();
    }
}
