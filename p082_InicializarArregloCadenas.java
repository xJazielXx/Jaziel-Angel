public class p082_InicializarArregloCadenas {
    public static void main(String[] args) {
        String[] municipios=new String[10];

        municipios[0]= "Apozol";
        municipios[1]= "Apulco";
        municipios[2]= "Cañitas";
        municipios[3]="Jeres";
        municipios[4]="Fresbillo";
        municipios[5]="Rio Grande";
        municipios[6]="Sain Aalto";
        municipios[7]="Sombrerete";
        municipios[8]="Teul de Gonzales Ortega";
        municipios[9]="Zacatecas";

        System.out.printf("Primer elemento del arreglo %s\n",municipios[0]);
        System.out.printf("Ultimo elemento del arreglo: %s\n",municipios[9]);

        System.out.println("\nTodos los elementos del arreglo con ciclo for:");
        for(int i=0; i < municipios.length; i++) {

        System.out.printf( "%s ",municipios[i] );

        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each:");
        for(String m : municipios) {

        System.out.printf( "%s ", m );

}



        }
    



}
