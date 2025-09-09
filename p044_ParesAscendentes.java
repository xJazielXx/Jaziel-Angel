import java.util.Scanner;

public class p044_ParesAscendentes {
    
    public static void main(String[] args) {
        //Se declaran las variables
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {

             System.out.println("Imprime numeros pares\n");
             System.out.println("hasta que numero ?");
             n = obj.nextInt();
             //inciamos la variable en cero, inicia el contador desde cero
             s=0;c=2;
            while (c<=n) {
                  System.out.printf("%d",c);
                  s = s + c;
                 c = c + 2;
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        }while(resp != 'N');
        System.out.println("\nGracias por usar este programa");
    



    





    }




}
