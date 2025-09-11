import java.util.Scanner;

public class p055_SumaParesImpares {
    public static void main(String[] args) {
        int n, opcion, suma;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("Impares ascendentes... [1]");
            System.out.println("Pares descendentes... [2]");
            System.out.println("Salir.........[3]");
            System.out.print("Elige una: ");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    suma = 0;
                    System.out.println("\nImpares ascendentes y su suma");
                    System.out.print("Hasta donde: ");
                    n = obj.nextInt();
                    for (int i = 1; i <= n; i += 2) {
                        System.out.printf("%d ", i);
                        suma += i;
                    }
                    System.out.printf("\nLa suma de impares: %d\n", suma);
                    break;

                case 2:
                    suma = 0;
                    System.out.println("\nPares descendentes y su suma:");
                    System.out.print("Hasta donde: ");
                    n = obj.nextInt();
                    n = (n % 2 == 0 ? n : --n); // si es impar lo ajusta al par menor
                    for (int i = n; i >= 1; i -= 2) {
                        System.out.printf("%d ", i);
                        suma += i;
                    }
                    System.out.printf("\nLa suma de los pares es: %d\n", suma);
                    break;

                case 3:
                    System.out.println("\nVete por donde viniste pues");
                    break;

                default:
                    System.out.println("\nIncorrecto, agrega algo bien");
                    break;
            }

            System.out.println("\nPresiona <Enter> para continuar");
            obj.nextLine(); 
            obj.nextLine(); 
        } while (opcion != 3);

        System.out.println("\nProceso Terminado ....");
      
    }
}

