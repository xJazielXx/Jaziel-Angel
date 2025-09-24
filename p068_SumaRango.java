import java.util.Scanner;

public class p068_SumaRango {
    public static float SumaRango(float ini, float fin) {
        float s=0;
        for(float i=ini; i<=fin; i++)
                   s+=i;
        return s;
    }

    public static void main(String[] args) {
        float i, f, res;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Dime el inicio");
            i = obj.nextInt();
            System.out.print("Dime el final");
            f = obj.nextInt();

        }while(i>f);
        res = SumaRango(i,f);
        System.out.printf("La suma del rango es %.2f",res);
    }
    
}
