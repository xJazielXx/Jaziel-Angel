import java.util.Scanner;

public class p054_ArribaAbajo {
    public static void main(String[] args) {
        int n, opcion;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("Numeros de 1 a n...[1]");
            System.out.println("Numeros de n a 1....[2]");
            System.out.println("Salir..... [3]");
            System.out.print("Elije papito: ");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Hasta donde: ");
                    n = obj.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.printf("%d ", i);
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Desde donde: ");
                    n = obj.nextInt();
                    for (int i = n; i >= 1; i--) {
                        System.out.printf("%d ", i);
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\nVete a la fregada pues, bai");
                    break;

                default:
                    System.out.println("Elije una opcion valida papito");
                    break;
            }
        } while (opcion != 3);

        System.out.println("\nProceso terminado....");
    }
}

