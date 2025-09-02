import java.util.Scanner;

public class P026_TipoAngulo  {

    public static void main(String [] args ) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Meuestra el tipo de amgulo con los grados");
        System.out.println("Dame un angulo de 0 a 360 grados");
        int angulo = new Scanner(System.in).nextInt();


        System.out.print("El angulo que introdujiste: ");
        if(angulo<90)
        System.out.println("Es agudo");

        if(angulo==90)
        System.out.println("Es recto");

        if(angulo>90 && angulo<180)
        System.out.println("Es obtuso");

        if(angulo==180)
        System.out.println("Es llano");

        if(angulo>180 && angulo<360)
        System.out.println("Es concavo");

       if(angulo==360)
       
       System.out.println("Es completo");
       System.out.println("\nProceso terminado ....");





    }
    



}
