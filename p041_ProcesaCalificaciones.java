import java.util.Scanner;

public class p041_ProcesaCalificaciones {

    public static void main(String[] args) {
        int c, n;
        float cal=0, suma=0, prom=0;
        Scanner obj= new Scanner(System.in);

        System.out.println("\nCuantas calificaciones");
        n = obj.nextInt();
        c = 1;
        while(c<= n) {
            System.out.printf("calificacion %2d?", c++);
            cal = obj.nextFloat();
            suma = suma + cal;


        }
        prom = suma/n;
        System.out.printf("La suma es : %.2f\n",suma);
        System.out.printf("El promedio es :%2f\n", prom);


        



    }
    


}
