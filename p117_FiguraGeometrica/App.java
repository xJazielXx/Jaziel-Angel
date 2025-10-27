package p117_FiguraGeometrica;

import p104_PuntoCirculo.Circulo;

public class App {
    public static void main(String[] args) {
        System.out.println("\nProbando clase circulo: ");
        Circulo figura1 = new Circulo(10.0);
        System.out.println(figura1);
        figura1.ajustar(0.5);
        System.out.println(figura1);

        System.out.println("\nProbando clase circulo: ");
        Rectangulo figura2 = new Rectangulo(10,20);
        System.out.println(figura2);
        figura2.ajustar(0.5);
        System.out.println(figura2);    }
    
}
