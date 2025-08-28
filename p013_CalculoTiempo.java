import java.util.Scanner;

public class p013_CalculoTiempo {

    public static void main(String [] args ) {
        double horas;
        double dia = 24;
        double minutos = 60;
        double segundos = 3600;

        Scanner obj = new Scanner(System.in);

        System.out.print("Dime las horas que quieras convertir: ");
        horas = obj.nextDouble();

        double diasHora = (horas / dia);
        double minutosHora = ( horas * minutos);
        double segundosHora = ( horas * segundos);

        System.out.println( String.format("En dias son %f y en minutos %f y en segundos %f", diasHora, minutosHora, segundosHora));


        obj.close();




 

    }


    


}
