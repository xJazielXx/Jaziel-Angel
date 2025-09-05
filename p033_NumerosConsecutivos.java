import java.util.Scanner;


public class p033_NumerosConsecutivos {

    public static void main(String[] args ) {
        Scanner obj = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("\nDado 3 numeros veremos si son consecutivos o no\n");

        System.out.println("Dime un numero");
        num1 = obj.nextInt();

        System.out.println("Dame el segundo numero");
        num2 = obj.nextInt();

        System.out.println("Dame el tercer numero");
        num3 = obj.nextInt();

        if ((num2 == num1 + 1) && (num3 == num2 +1)){
            System.out.print("Son consecutivos");
        } else {
            System.out.print("No son consecutivos");

        }












    }

    




}
