import java.util.Scanner;

public class p025_EstacionesAño {
    public static void main(String[] args ) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra la estacion del año con un numero\n");
        System.out.println("Dame un numero del 1 al 4");
        int n = new Scanner(System.in).nextInt();

        if(n==1)System.out.println("Primavera");
        if(n==2)System.out.println("Verano");
        if(n==3)System.out.println("Otoño");
        if(n==4)System.out.println("Invierno");

        System.out.println("Listo, terminado");
        






    }











    
}
