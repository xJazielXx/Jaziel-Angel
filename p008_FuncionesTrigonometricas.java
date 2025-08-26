import java.util.Scanner;

public class p008_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un angulo en Grados: ");
        double angulog = new Scanner(System.in).nextDouble();
        double angulor = Math.toRadians(angulog);
        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);
        System.out.println(String.format("El angulo es: %.2f, Seno: %.2f, Coseno: %.2f, Tangente: %.2f", angulor, sen, cos, tan));
    }
}