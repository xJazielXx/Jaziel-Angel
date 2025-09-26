import java.util.Scanner;


public class p076_NumeroMenor{
    public static int Menor( int n1, int n2, int n3, int n4){
        int men=0;
        //Calculo del numero menor 
        if(n1<n2 && n1<n3 && n1<n4)
        men=1;
        else if(n2<n1 && n2<n3 && n2<n4)
        men=n2;
        else if(n3<n1 && n3<n2 && n3<n4)
        men=n3;
        else if(n4<n1 && n4<n2 && n4<3)
        men=n4; 

        //Guaradmos el resultado en menor
        return men;


    }
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner obj= new Scanner(System.in);

        //Preguntamos los numeros
        System.out.println("Ingresa un numero");
        n1 = obj.nextInt();
        System.out.println("Ingresa un numero");
        n2 = obj.nextInt();
        System.out.println("Ingresa un numero");
        n3 = obj.nextInt();
        System.out.println("Ingresa un numero");
        n4 = obj.nextInt();

        //imprimimos el resultado llamando a la funcion Menor con el "%d" de numero entero
        System.out.printf("El numero menor es: %d",Menor(n1, n2, n3, n4));


    }


}