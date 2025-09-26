import java.util.Scanner;

public class p078_MedidasLongitud {

    public static double Centimetros(double pul){
        double cent;

        cent= pul*2.54;

        return cent;

        



    }
    public static double Pies(double met){
        double pies;

        pies = met*3.281;

        return pies;
    }

    public static void main(String[] args) {
        double pul, met;
        char op;
        Scanner obj= new Scanner(System.in);

        System.out.println("Dime cuantas pulgadas");
        pul = obj.nextDouble();
        System.out.println("Dime cuantos metros");
        met= obj.nextDouble();
        System.out.println("A que quieres convertir?,Centimetros(C) o Pies(P)");
        op=Character.toUpperCase(obj.next().charAt(0));
        if(op=='C'){
            System.out.printf("Convertidos serian: %.2f\n", Centimetros(pul));
        }else if(op=='P'){
            System.out.printf("Convertidos serian: %.2f\n", Pies(met));

        }

        



    }

    

}
