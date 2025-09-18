import java.util.Scanner;

public class p061_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;

        System.out.println("Dime el numero de renglones");
        n = obj.nextInt();

        for(int i=1; i<=n; i++){
            for( int j = 1; j<=i; j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }



        

    }
    

}
