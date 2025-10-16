package p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Todas las formas: ");
        
        ArrayList<Forma> formas = new ArrayList<>();
        
        formas.add(new Circulo("Rojo", true, 10.23));
        formas.add(new Circulo("Verde", false, 99.12));
        formas.add(new Circulo("Amarillo", false, 10.20));
        formas.add(new Circulo("Azul", true, 10.23));
        
        for (Forma forma : formas) {
            System.out.println(forma);
        }
        
        System.out.println("\nCalculando areas y perimetros de las figuras:");
        
        for (Forma forma : formas) {
            System.out.println("La forma es un: " + (forma instanceof Circulo ? "Circulo" : "Rectangulo") + "\n");
            
            if (forma instanceof Circulo) {
                System.out.println("El area es: " + ((Circulo) forma).getArea());
                System.out.println("El perimetro es: " + ((Circulo) forma).getPerimetro());
            } else {
                System.out.println("El area es: " + ((Rectangulo) forma).getArea());
                System.out.println("El perimetro es: " + ((Rectangulo) forma).getPerimetro());
            }
            System.out.println(); // Línea en blanco para separar
        }
    }
}