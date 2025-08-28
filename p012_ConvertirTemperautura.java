import java.util.Scanner;

public class p012_ConvertirTemperautura {

    public static void main(String[] args ) {
        
    //Declaramos las variables donde vamos almacenar los grados y donde se almacenara el resultado
    double fahrenheit, celsius;
    Scanner obj = new Scanner(System.in);

    //Aqui se usa en print para preguntar los grados, y abajo se almacena lo que pongan en la variable fahrenheit de tipo doble
    System.out.print("Dime los grados fahrenheit para convertir a celsius:");
    fahrenheit = obj.nextDouble();

    //Aqui se hace el calculo, primero se le resta 32 al numero de fahrenh8eit, se multiplica por 5 y se divide entre 9
    celsius = (fahrenheit - 32) * 5.0 / 9.0;

    //Mostramos resultado
    System.out.println("Los grados son: " + celsius);


    obj.close();











    }


    
}
