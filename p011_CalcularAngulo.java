import java.util.Scanner;


public class p011_CalcularAngulo {


    public static void main(String[] args ) {
        Scanner obj = new Scanner(System.in);
        final int Suma_Angulos = 180;

        System.out.print("Dame el angulo uno: ");
        int Angulo1 = obj.nextInt();

        System.out.print("Dame el segundo angulo: ");
        int Angulo2 = obj.nextInt();
        
        int Angulo3 = Suma_Angulos - (Angulo1 + Angulo2);


        System.out.println("El resultado del tercer angulo es:" + Angulo3);


     



    }
    
}
