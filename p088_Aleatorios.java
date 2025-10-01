import java.util.Random;

public class p088_Aleatorios {
    public static void main(String[] args) {
        Random rnd= new Random();
        
         //aleatorio sin rando
        int aleatorio1=Math.abs(rnd.nextInt());
        //aleatorio con rango de 30
        int aleatorio2=Math.abs(rnd.nextInt(30));
        //aleatorio con rango desde donde a donde
        int aleatorio3=Math.abs(rnd.nextInt(100-50))+50;


        System.out.printf("Numero aleatorio entero positivo; %d",aleatorio1);
        System.out.printf("Numero aleatorio de 0 a 30: %d",aleatorio2);
        System.out.printf("Numero aleatorio de 50 al 99 : ", aleatorio3);
    }

    
}
