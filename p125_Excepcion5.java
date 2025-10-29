import java.util.Scanner;


public class p125_Excepcion5 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int pos;
        
        try{
            System.out.println("Que posicion del arreglo deseas acceder??");
            pos = new Scanner(System.in).nextInt();
            System.out.println("La posicion" + pos +", contiene el valor de "+ a[pos]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Estas tratando de accedera a una posicion del arreglo fuera de limite");
            System.out.println("Mensaje del sistema:" + e);
        }finally{
            System.out.println("Los elementos que tiene el arrreglo son:");
            for(int i:a){
                System.out.print(i+" ");
            }
        }
        
    }
    
}
