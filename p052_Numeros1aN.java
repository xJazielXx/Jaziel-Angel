import java.util.Scanner;



public class p052_Numeros1aN {
    public static void main(String[] args) {
        //creamos las variables de hasta donde, y hasta que paso
        int n,p;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nNumeros de 1 a n con paso del que tu quieras");
        System.out.print("\nHasta donde? ");
        n = obj.nextInt();
        System.out.print("Con que paso? ");
        p = obj.nextInt();
        
        //Inicializamos desde donde va empezar, y ponemos hasta donde y con que paso
        for (int i=1; i<=n; i+=p) {
            System.out.printf("%d",i);
        }
        

    }
    
}
