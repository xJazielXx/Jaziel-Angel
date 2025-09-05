import java.util.Scanner;

public class p037_CalculoNotas {
    
    public static void main(String[] args) {
        double cal1, cal2, cal3, cal4, cal5, prom;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calcular el promedio de las calificaciones");

        // Aqui pedimos calificaciones y gaurdamos en variables
        System.out.println("Dime la primera calificación");
        cal1 = obj.nextDouble();
        if (cal1 > 10 || cal1 < 0) {
            System.out.println("Error: la calificación debe estar entre 0 y 10");
            return; // detener el programa
        }

        System.out.println("Dime la segunda calificación");
        cal2 = obj.nextDouble();
        if (cal2 > 10 || cal2 < 0) {
            System.out.println("Error: la calificación debe estar entre 0 y 10");
            return;
        }

        System.out.println("Dime la tercera calificación");
        cal3 = obj.nextDouble();
        if (cal3 > 10 || cal3 < 0) {
            System.out.println("Error: la calificación debe estar entre 0 y 10");
            return;
        }

        System.out.println("Dime la cuarta calificación");
        cal4 = obj.nextDouble();
        if (cal4 > 10 || cal4 < 0) {
            System.out.println("Error: la calificación debe estar entre 0 y 10");
            return;
        }

        System.out.println("Dime la quinta calificación");
        cal5 = obj.nextDouble();
        if (cal5 > 10 || cal5 < 0) {
            System.out.println("Error: la calificación debe estar entre 0 y 10");
            return;
        }

        // Calcular el promedio
        prom = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

        System.out.println("\nTu promedio es: " + prom);

        // Y aqui se evalua el resultado
        if (prom <= 6) {
            System.out.println("Reprobado");
        } else if (prom <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (prom <= 8) {
            System.out.println("Muy bien");
        } else if (prom <= 9) {
            System.out.println("Excelente vro");
        } else if (prom <= 10) {
            System.out.println("Perfecto");
        }

        System.out.println("\n\nProceso terminado");
    }
}
