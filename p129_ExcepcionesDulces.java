import java.util.InputMismatchException;
import java.util.Scanner;

public class p129_ExcepcionesDulces {
    public static void main(String[] args) {
        int niños, dulces, res;
        Scanner obj = new Scanner(System.in);

        try{
            System.out.println("Numero de niños en el barrio");
            niños = obj.nextInt();
            System.out.println("Cantidad de dulces existentes");
            dulces = obj.nextInt();

            res = niños/dulces;
            System.out.println("A cada niño de tocan " + res + " dulces");

        }catch(InputMismatchException e){
            System.out.println("Los niños y dulces deben ser cantidades numericas papito");
        }catch(ArithmeticException e){
            System.out.println("Si no hay dulces, no puedo repartir dulces");
        }

        
    }

    
}
