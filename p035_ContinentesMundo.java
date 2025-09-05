import java.util.Scanner;

public class p035_ContinentesMundo {

    public static void main(String[] args ) {

         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("Dado un numero se te dira que continente es\n");
         System.out.println("Dame un numero del 1 al 6: ");
         int num = new Scanner(System.in).nextInt();
         switch (num) {
            case 1:
            System.out.println("Asia");
            break;
            case 2:
            System.out.println("Africa");
            break;
            case 3:
            System.out.println("America del norte");
            break;
            case 4:
            System.out.println("America del Sur");
            break;
            case 5:
            System.out.println("Antartida");
            break;
            case 6:
            System.out.println("Europaa");
            break;

            default:System.out.println("Pon algo validooo, a saaal");
            break;

         }




    }





    






}
