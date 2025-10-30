import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
    double n, raiz;
    Scanner obj = new Scanner(System.in);


    try{
        System.out.println("Introduce un numero:");
        n = obj.nextFloat();
        raiz = Math.sqrt(n);
        System.out.println("La raiz cuadrada es: " + raiz);
    
    }catch(Exception e){
        System.out.println("Error, no puedo calcular la raiz cuadrada");
    }

    

    }
    
}
