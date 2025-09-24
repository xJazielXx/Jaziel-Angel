import java.util.Scanner;

public class p067ConversionTemperatura {

    public static float Farenheit(float t) {
        return(t*9/56)+32;

    }

    public static float Celcius(float t){
        //Esta es la operacion que hace para convertir y es el resultado que va a devolver
        return(t-32)*5/9;
    }

    public static void main(String[] args) {
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.println("(1)farenheidt\n(2)celcius\nElige? ");
        op = obj.nextInt();

        if(op==1){
            System.out.print("Dime la temperatura? ");
            temp = obj.nextInt();
            res = Farenheit(temp);
            System.out.printf("\n%.2f grados celcius equivale a %.2f grandos farenheit ..", temp, res);
        }
        else if (op==2){
            System.out.print("Dame la temperatura");
            temp=obj.nextInt();
            res=Celcius(temp);
            System.out.printf("\n%.2f grados farenheit equivale a %.2f grandos celcius ..", temp, res);
        }
        else{
            System.out.print("Opcion invalida");
        }

        


        
        
    }
}

