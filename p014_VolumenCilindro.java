//Importamos un Scanner para la entrada de datos
import java.util.Scanner;


public class p014_VolumenCilindro {

    public static void main(String [] args ) {


        //Aqui defini las variables double por si habia decimales, y aqui mismo se guardaran los datos 
        double radio, altura, volumen;
        double PI = 3.1416;
        Scanner obj = new Scanner(System.in);

        //Aqui le pedimos al usuario que nos ponga los datos, y abajo en el "obj" que se almacenara en la variable lo que se ponga 
        System.out.print("Dame el radio del cilindro: ");
        radio = obj.nextDouble();


        System.out.print("Dame la altura del cilindro: ");
        altura = obj.nextDouble();
        
        //Aqui hacemos el calculo, teniendo en cuenta el valor de PI definido, y con lo que el usuario puso en la entrada de datos, ahora solo multiplica el PI por el cuadrado del radio y posteriormente multiplicarlo por la altura
        volumen = PI * ( radio * radio) * altura;

       // y por ultimo ya solo imprimimos el resultado que se almaceno en la variable "volumen"
        System.out.println("El volumen del cilindro es: " + volumen);


        obj.close();







    }











    
}
