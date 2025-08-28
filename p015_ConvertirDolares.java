import java.util.Scanner;

public class p015_ConvertirDolares {

    public static void main(String [] args ) {

        double peso = 0.054;
        double dolar;
        double Dolar_peso;

        Scanner obj =  new Scanner(System.in);

        System.out.print("Dame los dolares que queiras convertir a pesos: ");
        dolar = obj.nextDouble();

        //Calculo
        Dolar_peso = ( dolar * peso);

        System.out.println("Tus dolares convertidos son: " + Dolar_peso);

        obj.close();







    }


    
}
