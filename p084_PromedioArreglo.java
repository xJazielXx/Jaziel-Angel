import java.util.Scanner;

public class p084_PromedioArreglo {
    public static void main(String[] args) {
        int n=0;
        float suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Cuantas calificaciones deseas procesar ???????");
        n=obj.nextInt();
        float[] calif= new float[n];

        System.out.printf("Introduce las %d calificaciones \n",n);
        for(int i=0; i<calif.length; i++){
            System.out.printf("Calificacion %d", i+1);
            calif[1]=obj.nextFloat();
        }

        System.out.println("\nEl arreglo de calificaciones capturadas es :");
        for(float cal: calif){
            System.out.printf("%.2f",cal);
            suma = suma + cal;

        }
        promedio = suma /calif.length;

        System.out.printf("\nLa suma de las calificaciones es: %.2f",suma);
        System.out.printf("\nEl promedio de las calificaiones es: %.2f", promedio);


        
    }

    
}
