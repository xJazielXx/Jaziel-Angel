import java.util.Scanner;

public class p078SumaMultiplos {
    public static int SumaMultiplos(int ini, int fin, int constante) {
    // Validar que ini < fin sino sale error
    if (ini >= fin) {
        return -1; 
    }
    
    int suma = 0;  // 
    
    for(int i = ini; i <= fin; i++) {
        // Verificar si i es múltiplo de la constante
        if (i % constante == 0) {
            suma = suma + i;  // Sumar el múltiplo
            


            
        }
    }
    
    return suma;  // Retornar el resultado
} 
public static void main(String[] args) {
    int ini, fin, constante;
    Scanner obj = new Scanner(System.in);

    System.out.println("Dime el numero de inicio");
    ini=obj.nextInt();
    System.out.println("Dime el numero de final ");
    fin=obj.nextInt();
    System.out.println("Elige una constante, 3 o 4");
    constante=obj.nextInt();

    //imprimimos el resultado con la funcion
    System.out.printf("La suma de los multiplos fue: %d",SumaMultiplos(ini, fin, constante));


}

   


}