import java.util.Scanner;


public class p003_AreaTriangulo {
    
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame el numero de la base  ?");
        base = obj.nextInt();
        System.err.print("Danme la alruta  ?");
        altura = obj.nextInt();

        area = base * altura / 2;


        System.out.println(   String. format( "El triangulo de base %d y altura %d tiene un area de %.2f", base, altura, area) );
        




    }







}
