import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        int n;
        double  suma=0;
        Scanner obj= new Scanner(System.in);

        System.out.println("Cuantos terminos??");
        n = obj.nextInt();
         
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("1/"+ j + " ");
                suma += 1.0 / j;

            }
            System.out.println();
        }
        System.out.println("La suma total es: "+ suma);
    
    }
    

}
