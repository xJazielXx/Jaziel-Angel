public class p081_InicializarArregloNumeros {
    public static void main(String[] args) {
        double[] num = new double[7];

        num[0] = 5.0;
        num[1] = 10.0;
        num[2] = 15.5;
        num[3] = 20.5;
        num[4] = 25.0;
        num[5] = 100.22;
        num[6] = 90.0;

        System.out.printf("Primer numero del arreglo es: %.2f\n", num[0]);
        System.out.printf("Ultimo numero del arreglo es: %.2f\n", num[6]); 
        
        System.out.println("Todos los numeros en un ciclo for: ");
        for(int i = 0; i < num.length; i++) {
            System.out.printf("%.2f ", num[i]);  
        }
        
        System.out.println("\nAhora todos los numeros del arreglo con un for each:"); 
        for(double elemento : num) {
            System.out.printf("%.2f ", elemento);  
        }

        System.out.println("\n\nProceso terminado ");
    }
}