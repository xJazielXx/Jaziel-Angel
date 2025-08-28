//Importamos Scanner para la entrada de datos
import java.util.Scanner;

public class p010_HipotenusaTriangulo {
    
    public static void main(String[] args) {

        //Aqui se guardaran los datos de longitudes
        double Hipotenusa, LongitudLado1, LongitudLado2;
        Scanner obj = new Scanner(System.in);
        
        //pedimos al usuario que ingrese las longitudesn 5lo 87abgry7´8yfc dxszw
        System.out.print("Dame la longitud del lado 1: ");
        LongitudLado1 = obj.nextDouble();
        
        System.out.print("Dame la longitud del lado 2: ");
        LongitudLado2 = obj.nextDouble();


        Hipotenusa = Math.sqrt((LongitudLado1 * LongitudLado1) + (LongitudLado2 * LongitudLado2));

        
        System.out.println("La hipotenusa de tu triángulo es " + Hipotenusa);

        

        obj.close();
    }
}

