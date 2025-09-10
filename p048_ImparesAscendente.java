import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String args[]) {
        int n, c, s, contador;
        char resp;
        double prom;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("Imprime números impares\n");
            System.out.print("¿Desde qué número? ");
            n = obj.nextInt();

            s = 0;
            contador = 0;

            // si n es par, lo hacemos impar
            if (n % 2 == 0) {
                n++;
            }

            c = n;
            while (c <= 10) {   // ejemplo: hasta el 10
                System.out.printf("%d ", c);
                s += c;
                contador++;
                c += 2;   // siguiente impar
            }

            prom = (double) s / contador;

            System.out.printf("\nLa suma es: %d\n", s);
            System.out.printf("El promedio es: %.2f\n", prom);

            System.out.print("\n¿Desea continuar? (S/N): ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');

        System.out.println("\nGracias por utilizar este programa !");
    }
}
