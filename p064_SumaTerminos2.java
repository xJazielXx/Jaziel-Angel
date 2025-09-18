import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();
        
        int suma = 0;
        String secuencia = "";
        
        // Generar la secuencia y calcular la suma
        for (int i = 1; i <= n; i++) {
            int termino = 0;

            // Construir cada término 
            for (int j = 0; j < i; j++) {
                termino = termino * 10 + 1;
            }
            
            suma += termino;
            
            // Construir la cadena de la secuencia
            if (i > 1) {
                secuencia += "+";
            }
            secuencia += termino;
        }
        
        // Imprimir resultados
        System.out.println(secuencia);
        System.out.println("suma " + suma);
        
      
    }
}
    