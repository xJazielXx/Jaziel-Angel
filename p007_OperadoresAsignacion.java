import java.util.Scanner;

public class p007_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 

        System.out.print("Dame un numero ? ");
        float num = new Scanner(System.in).nextFloat();

        System.out.printf("El numero original es : %.2f \n", num);
        System.out.printf("Incrementar 1 : %.2f \n", ++num);
        System.out.printf("Sumar 80 : %.2f \n", num += 80);
        System.out.printf("Restar 35 : %.2f \n", num -= 35);
        System.out.printf("Multiplicar por 15 : %.2f \n", num *= 15);
        System.out.printf("Dividir entre 4 : %.2f \n", num /= 4);
        System.out.printf("Decrementar 1 : %.2f \n", --num);
    }
}