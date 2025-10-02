import java.util.Scanner;

public class p092_MayorMenor {
    
    public static int[] CapturarNumeros(){  
        Scanner obj = new Scanner(System.in);
        

        System.out.print("¿Cuántos números? ");
        int num = obj.nextInt();

        int[] numeros = new int[num];

        System.out.println("Pues ingresa los números papito:");

        for(int i = 0; i < num; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = obj.nextInt();

        }

        return numeros;  

    
    } 
    
    public static void MostrarElementos(int[] numeros){
        System.out.println("\n CONTENIDO DEL ARREGLO ");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Posición [%d]: %d\n", i, numeros[i]);  
        }
    }    
    
    public static int NumeroMayor(int[] numeros){  
        if(numeros.length == 0) return -1;  

        int mayor = numeros[0];
        
        for(int num : numeros){
            if(num > mayor) {
                mayor = num;
            }
        }
        return mayor;  
    }
    
    public static int NumeroMenor(int[] numeros){
        if(numeros.length == 0) return -1;

        int menor = numeros[0];
        
        for(int num : numeros){
            if(num < menor) {
                menor = num;

            }


        }

        return menor;


    }
    
    
    public static void main(String[] args) {
        int[] numeros = CapturarNumeros();
        MostrarElementos(numeros);
        
        int mayor = NumeroMayor(numeros);
        int menor = NumeroMenor(numeros);

        
        System.out.println("\n RESULTADO ");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);


    }





}