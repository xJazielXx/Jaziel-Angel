import java.util.Scanner;


public class p053_NumerosNa1 {
    public static void main(String[] args) {
        //variables donde se dira hasta donde, y en que retroceso  
        int n,p;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nImprimir n a 1 con paso de p");
        System.out.print("\nDesde donde? ");
        n = obj.nextInt();
        System.out.print("Con que retroceso? ");
        p = obj.nextInt();

            //Iniciamos desde donde nos digan, hasta el numero 1, y con retroceso de p
        for (int i=n; i>=1; i-=p ) {
            System.out.printf("%d",i);
        }
        


    }
    
}
