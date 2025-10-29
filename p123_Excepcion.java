import java.util.InputMismatchException;
import java.util.Scanner;

public class p123_Excepcion {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner obj = new Scanner(System.in);
        
        try{
            System.out.println("Dame el valor del numerador");
            a = obj.nextInt();
            System.out.println("Dame el valor del numerador");
            b = obj.nextInt();
            int res = a/b;
            System.out.println("El resultado es "+ res);
        } catch(ArithmeticException e){          // para derectar este error matematico utilizamos ArithmeticException
            System.out.println("El denominador no puede ser cero");          //Si se ingresa el cero, en ves de salir del programa, va a dar este error
        } catch(InputMismatchException e){        // para detectar este error de entrada de datos, que ponga letras u otra cosa utilizamos ArithmeticException
            System.out.println("Numerador y denominador deben de ser numeros enteros papito"); // En caso de que ponga algo asi dara este error en ves de salirse del programa
        }
    }
    
}
