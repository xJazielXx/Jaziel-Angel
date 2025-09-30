public class p083_InicializarNombresEdades {
    public static void main(String[] args) {
        String[] nombres={"Jorge", "Pedro", "Iker", "juanito", "Jaziel", "moncho"};
        int[] edades={22,25,44,38,50,16};

        System.out.println("Los nombres son :");
        for(String nombre: nombres)
        System.out.println(nombre);

        System.out.println("Las edades son: ");
        for(int edad: edades)
        System.out.println(edad);

        System.out.println("Cada nombre con su edad");
        for(int i=0; i<nombres.length; i++)
        System.out.printf("Nombre: %s, y su edad es: %d\n",nombres[i],edades[i]);
        

        

        



    }


    
}
