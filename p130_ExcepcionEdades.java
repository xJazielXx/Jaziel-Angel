import java.util.InputMismatchException;
import java.util.Scanner;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        int[] edades = new int[5];
        Scanner obj = new Scanner(System.in);

        try{
            System.out.println("Captura las edades de 5 personas");

            System.out.println("Edad de persona 1");
            edades[0] = obj.nextInt();
            System.out.println("Edad de persona 2");
            edades[1] = obj.nextInt();
            System.out.println("Edad de person 3");
            edades[2] = obj.nextInt();
            System.out.println("Edad de persona 4");
            edades[3] = obj.nextInt();
            System.out.println("Edad de persona 5");
            edades[4] = obj.nextInt();

            System.out.println("Captura terminada las edades son: ");
            for(int i:edades){
                System.out.print(i+", ");
            }

        }catch(InputMismatchException e){
            System.out.println("Introduce un numero entero vro");
            
        }

        
    }
    
}
