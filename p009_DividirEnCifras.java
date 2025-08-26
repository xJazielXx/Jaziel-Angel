import java.util.Scanner;

public class p009_DividirEnCifras {
    public static void main(String[] args) {
        int num, unidades, decenas, centenas;
        
        System.out.println("Dame un numero entero de 3 cifras: ");
        num = new Scanner(System.in).nextInt();
        
        centenas = num / 100;
        decenas = (num % 100) / 10;
        unidades = num % 10;
        
        System.out.println("El numero introducido fue: " + num);
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
    }
}