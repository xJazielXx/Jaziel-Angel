import java.util.Scanner;

public class p059F_FactorialNumeros {
    public static void main(String[] args) {
        int i,j,n,f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("Cuantos numeros?");
            n = obj.nextInt();
            for(i=1; i<=n; i++){
                System.out.printf("%d",i);
                f=1;
                for(j=1; j<=i; j++){
                    f*=j;
                }
                System.out.print(f);
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(obj.next().charAt(0));


        }while(resp!='N');
        System.out.print("\nProceso terminado, adios..");

       















    }
}   