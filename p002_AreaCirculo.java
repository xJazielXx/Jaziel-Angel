//Importamos la blibleria para la entrada de datos y que nos pueda leer datos del usuario

import java.util.Scanner; 

public class AreaCirculo {
       public static void main(String[] args) {
       //definimos la variable tipo double para numeros decimales
       double radio, area;
       //creamos la instancia de la clase Scanner para leer los valores del usuario
       Scanner lradio = new Scanner(System.in);
 
       System.out.println("\nCalculando el area de un circulo\n");
       //Ahora con este mostramos el mensaje que nos de el radio
       System.out.print("Dame el numero del radio  ? ");
       radio = lradio.nextFloat();
  
        //y aqui calculamos el area del circulo
       area = Math.PI * Math.pow(radio, 2);

       //Y aqui se muestra el resultado
       System.out.println("El circulo de radio " + radio + "tiene un radio " + area);

}




}