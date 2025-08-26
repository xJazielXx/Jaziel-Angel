
import java.util.Scanner;


public class p004_PagaTrabajador {

    public static void main(String[] args) {

        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        //Entrada
 
        System.out.print("Dime el nombre del trabajador  ?");
        nombre = obj.nextLine();
        System.out.print("Horas de trabajo  ? ");
        horas = obj.nextInt();
        System.out.println("Paga por hora  ? " );
        paga = obj.nextFloat();
        tasa = 0.03;

        //Para el calculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        //salida
        System.out.println("\nResumeb de pagos\n");
        System.out.println(String.format(" El trabajador %s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f", nombre,horas,paga,tasa));
        System.out.println(String.format("Paga Bruta  = %.2f", pagabruta));
        System.out.println(String.format("Impuestos   = %.2f", impuesto));
        System.out.println(String.format("paga neta   = %.2f", paganeta));

    }
 





}
