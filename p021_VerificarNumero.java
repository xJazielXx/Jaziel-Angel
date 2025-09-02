import java.util.Scanner;

public class p021_VerificarNumero {
    public static void main(String[] args) {
        int num;
        System.out.println("Verifica si un numero es positivo, negativo o cero\n");
        System.out.println("Dame un numero: ");
        num = new Scanner(System.in).nextInt();

        if (num > 0) {
            System.out.println("El numero es POSITIVO");
        } else if (num < 0) {
            System.out.println("El numero es NEGATIVO");
        } else {
            System.out.println("El numero es CERO");
        }
        
        System.out.println("Gracias por utilizar este programa");
    }
}







    

