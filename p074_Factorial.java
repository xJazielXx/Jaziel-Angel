import java.util.Scanner;

public class p074_Factorial {
    public static double factorial(int n){
        double f=1;
        for(int i=1; i<=n; i++)
        f=f*i;
        return f;
    }
    public static void main(String[] args) {
        

        System.out.print("Dame un numero");
        int n = new Scanner(System.in).nextInt();

        System.out.printf("El factorial de %d es %.0f", n, factorial(n));
    }
    
}
