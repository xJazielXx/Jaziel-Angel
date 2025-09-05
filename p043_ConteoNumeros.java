import java.util.Scanner;

public class p043_ConteoNumeros {
    public static void main(String[] args) {
        int n, c;
        int suma, cp, cn, cz;

        n = c = suma = cp = cn = cz = 0;

        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Número mijo? ");
            n = obj.nextInt();
            
            if (n != 999) {  
                c++;
                suma += n;
                if (n > 0) cp++;
                else if (n < 0) cn++;
                else cz++;
            }

        } while (n != 999);

        System.out.printf("\nCuantos: %d", c);
        System.out.printf("\nSuma de los numeros: %d", suma);  
        System.out.printf("\nPositivos: %d", cp);
        System.out.printf("\nNegativos: %d", cn);
        System.out.printf("\nCeros: %d", cz);
    }
}

