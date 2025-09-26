import java.util.Scanner;

public class p072_SumaDigitos {

    public static int SumaDigitos(int n){
        int suma=0, digito;
        while(n!=0){
            digito= n%10;
            n=n/10;
            suma+=digito;
        }
        return suma;


    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame un numero para sumar sus digitos");
        n = obj.nextInt();

        System.out.printf("\nLa suma de los digitos es : %d",SumaDigitos(n));
    }

}

