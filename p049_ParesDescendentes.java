import java.util.Scanner;


public class p049_ParesDescendentes {
    public static void main(String[] args) {
        int n,c,s, contador;
        char resp;
        double prom;
        Scanner obj = new Scanner(System.in);
        do {

            System.out.println("Imprime numeros pares\n");
            System.out.println("Hasta que numero");
            n = obj.nextInt();

            s=0;
            contador = 0;
            c=100;
            while (c>=n) {
                System.out.printf("%d",c);
                s = s + c;
                c = c - 2;
                contador++;
                 
            }
            prom = (double)s / contador;
         

            System.out.printf("\nLa suma es %d",s);
            System.out.printf("\nEl promedio es %.2f", prom);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        }while(resp !='N');
        System.out.println("\nGracias por usar este programa");

        


    }

    




}
