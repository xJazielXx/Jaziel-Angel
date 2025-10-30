import java.util.InputMismatchException;
import java.util.Scanner;

public class p131_ExcepcionTemperatura {
    
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Ingrese temperatura en centígrados: ");
            double celsius = obj.nextDouble();
            
            
            if(celsius > 100) {
                throw new Exception("Temperatura demasiado alta, no se puede convertir");
            }
            
            double fahrenheit = celsiusAFahrenheit(celsius);
            System.out.printf("%.1f° centígrados = %.1f° Fahrenheit%n", celsius, fahrenheit);
            
        } catch (Exception e) {
            System.out.println("Error, p131_ExcepcionTemperatura.TemperaturaExcesiva:" + e.getMessage());
        }
    }
}