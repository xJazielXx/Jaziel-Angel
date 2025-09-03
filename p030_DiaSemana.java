import java.util.Scanner;

public class p030_DiaSemana {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("dado un numero sera el dia de la semana");
        System.out.println("Dame un numero del 1 al 7 ");
        int dia = new Scanner(System.in).nextInt();
        switch (dia) {
            case 1:System.out.printf("Lunes");break;
            case 2:System.out.printf("Martes");break;
            case 3:System.out.printf("Miercoles");break;
            case 4:System.out.printf("Jueves");break;
            case 5:System.out.printf("Viernes");break;
            case 6:System.out.printf("Sabadito");break;
            case 7:System.out.printf("Domingo");break;
            default:System.out.println("Dia invalido");break;
        }
    }
}