import java.util.Scanner;

public class p022_VerificarSuma {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.print("Dame un numero: ");
        num1 = obj.nextInt();

        System.out.print("Dame el otro numero: ");
        num2 = obj.nextInt();

        System.out.print("Dame el tercer numero: ");
        num3 = obj.nextInt();

        if(num1 + num2 == num3) {
            System.out.println("\nSon iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}





    


    

