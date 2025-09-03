import java.util.Scanner;



public class p031_NumerosRomanos {

    public static void main(String [] args ) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Convierte un numero del 1 al 10 en numero romano\n");
        System.out.println("Dame un numero");
        int num = new Scanner(System.in).nextInt();
        switch (num) {
            case 1:
            System.out.printf("I");
            break;
            
            case 2:
            System.out.printf("II");
            break;

            case 3:
            System.out.printf("III");
            break;

            case 4:
            System.out.printf("IV");
            break;

            case 5:
            System.out.printf("V");

            case 6:
            System.out.printf("VI");
            break;

            case 7:
            System.out.printf("VII");
            break;

            case 8:
            System.out.printf("VIII");
            break;

            case 9:
            System.out.printf("IX");
            break;


            case 10:
            System.out.printf("X");
            break;

            default:
            System.out.printf("Numero invalido, ingresalo bien");
            break;
        
                    }
    }

}
