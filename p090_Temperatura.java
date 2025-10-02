public class p090_Temperatura {

    public static void Temperatura(double[] temps) {
        temps[0] = 2.34;
        temps[1] = 44.56;
        temps[2] = 7.89;
        temps[3] = 0.5;
        temps[4] = 2.5;
        temps[5] = 4.67;
        temps[6] = 40.3;
        temps[7] = 22.35;
        temps[8] = 56.22;
    }

    public static void CeroMayoresA10(double[] temps) {
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > 10) {
                temps[i] = 0.0;
            }
        }
    }

    public static void main(String[] args) {
        // Aqui se crea el arreglo en el main
        double[] temperaturas = new double[9];
        
        // Aqui le agregamos valores al arreglo
        Temperatura(temperaturas);

        System.out.print("\nEl primer elemento del arreglo es: " + temperaturas[0]);
        System.out.print("\nEl tercer elemento del arreglo es: " + temperaturas[2]);

        System.out.print("\n\nTodos los elementos son: ");
        for (double temp : temperaturas) {
            System.out.print(temp + " ");
        }
        
        // Llamar al método para cambiar elementos > 10 a 0
        CeroMayoresA10(temperaturas);
        
        System.out.print("\n\nDespués de cambiar elementos > 10 a 0: ");
        for (double temp : temperaturas) {
            System.out.print(temp + " ");
        }

         System.out.print("\n\nTodos los elementos nuevamente ");
        for (double temp : temperaturas) {
            System.out.print(temp + " ");
        }



    }
}

    

    




    

