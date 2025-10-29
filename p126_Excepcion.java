import java.util.Scanner;
import java.io.File;


public class p126_Excepcion {
    public static void main(String[] args) {
        File nombres = new File("Nombres.txt");
        try{
            Scanner obj = new Scanner(nombres);
            while( obj.hasNextLine())
            System.out.print(obj.nextLine());

        }catch( Exception e){
            System.out.println("Problemas al procesar el archivo");
        }

        
    }

    
}
