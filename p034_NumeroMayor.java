import java.util.Scanner;



public class p034_NumeroMayor {
    public static void main(String[] args ) {
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);
        
        System.out.println(" Ingresa 3 numeoros para saber cual es el mayor\n");

        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();

        if ( num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);

        } else if (num2 > num1 && num2 > num3) {
        System.out.println("El mayor es: " + num2);
        
        } else {
            System.out.println("El mayor es: " + num3);
        }

     }
}




