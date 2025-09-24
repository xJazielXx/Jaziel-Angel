import java.util.Scanner;


public class p066_PromedioNumeros {
    public static float promedio(Float n1,float n2, float n3){
        float suma;
        suma = n1+n2+n3;
        return suma/3;
    }

    public static void main(String[] args) {
        float num1, num2, num3, prom;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dime el primer numero ?");
        num1 = obj.nextInt();
        System.out.println("Dime el segundo numero");
        num2 = obj.nextInt();
        System.out.println("Dime el tercer numero ? ");
        num3 = obj.nextInt();

        prom=promedio(num1, num2, num3);

        System.out.printf("El promedio de tus numeros fue %.2f",prom);


        


    }


    
}
