import java.util.Scanner;

public class p075_CuadroCaracter {
    public static void cuadro(int ren, int col, char car){
        for(int i=1; i<=ren; i++){
            for(int j=1; j<=col; j++)
            System.out.printf("%c", car);

        System.out.println();
        }
    }

    public static void main(String[] args) {
        int ren, col;
        char car;
        Scanner obj= new Scanner (System.in);

        System.out.print("Cuantos renglones?");
        ren = obj.nextInt();
        System.out.print("Cuantas columnas? ");
        col = obj.nextInt();
        System.out.print("Con que caractes lo quieres? ");
        car = Character.toUpperCase(obj.next().charAt(0));

    cuadro(ren,col,car);
    }

    
    
}
