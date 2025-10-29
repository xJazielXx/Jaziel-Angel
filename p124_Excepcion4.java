import java.util.InputMismatchException;
import java.util.Scanner;

public class p124_Excepcion4 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner obj = new Scanner(System.in);

        try{

            System.out.println("Valor del numerador..");
            a = obj.nextInt();
            System.out.println("Valor del numerador");
            b = obj.nextInt();
            int res = a/b;
            System.out.println("El resultado es"+ res);
        }catch (ArithmeticException | InputMismatchException e){ //ahora son juntos y mandar un solo mensaje
            System.out.println("Los valores deben ser numeros y del denomiandor no puede ser cer");
            System.out.println("Mensaje del sistema; "+ e);

        }
    }

    
}
