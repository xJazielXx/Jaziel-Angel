import java.util.Scanner;

public class p080_Angulo {
    public static void Angulo(int angulo){
        if(angulo<90){
            System.out.print("Es agudo");
        }else if(angulo==90){
              System.out.print("Es recto");

        }else if (angulo>90 && angulo<180){
              System.out.print("Es obtuso");
        }else if(angulo == 180){
              System.out.print("Es llano");
        }else if(angulo>180 && angulo<360){
              System.out.print("Es concavo");

        }else {
             System.out.print("Ángulo fuera de rango ");

             
        }


            
        

    }
    public static void main(String[] args) {
        

        System.out.println("Ingresa un angulo entre 0 y 360 grados");
        int angulo = new Scanner(System.in).nextInt();

        Angulo(angulo);

    
    }
    
}
