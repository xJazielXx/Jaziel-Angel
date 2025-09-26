import java.util.Scanner;

public class p077_DiaSemana{

    public static String DiaSemana(int dia){  

        
        switch (dia) {  

            //Hacemos cada caso con cada dia y numero de la semana
            case 1:
                return "Lunes";

            case 2:
                return "Martes";

            case 3:
                return "Miercoles";

            case 4:
                return "Jueves";

            case 5:
                return "Viernes";

            case 6:
                return "Sabadito";

            case 7:
                return "Domingo";

            default:
                return "Numero invalidooo papito, ingresa uno de los dias de la semana no seas menso";
                
        }



    }

    public static void main(String[] args) {
        int dia; 
        Scanner obj = new Scanner(System.in);

        System.out.println("Dime un numero de la semana y te dire que dia es");
        dia = obj.nextInt();

        //Aqui llamamos a la funcion con string por que es un una palabra
        String resultado = DiaSemana(dia);
        System.out.println(resultado);


    }



}
    

