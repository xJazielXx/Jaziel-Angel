import java.util.Scanner;

public class p045_ImparesDescendentes {
    public static void main(String[] args) {
        int n,c,s;
        char resp;
        Scanner obj= new Scanner(System.in);
        do { 
            System.out.println("Imprime numeros impares\n");
            System.out.println("Desde que numero? ");
            n = obj.nextInt();
            s=0;c=( n%2==0 ? --n : n);
            while( c>=1){
                System.out.printf("%d",c);
                s = s + c;
                c = c - 2;

            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));

} while( resp != 'N' );
System.out.println("\nGracias por utilizar este programa !");
}
}






           
    
    
    
    
    
    
    
    






    
    



