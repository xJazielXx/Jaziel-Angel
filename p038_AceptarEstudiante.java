import java.util.Scanner;


public class p038_AceptarEstudiante {

    public static void main(String[] args ) {
        int edad, promedio, cal1, cal2, cal3;
        String sexo;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Aceptar estudiante con edad y promedio\n");

        System.out.println("Dame la eda");
        edad = obj.nextInt();
        System.out.println("Dame una calificaion");
        cal1= obj.nextInt();
        System.out.println("Dame la segunda calificacion ");
        cal2 = obj.nextInt();
        System.out.println("Dame la calificacion 3");
        cal3 = obj.nextInt();
        System.out.println("Hombre o mujer? ");
        sexo = obj.next();

        
        promedio = (( cal1 + cal2 + cal3) / 3);

           //Aqui el validamos que se escriba solo "mujer", para ser aceptada
        if (promedio>=8 && edad>=21 && sexo.equalsIgnoreCase("mujer")) {
            System.out.println("Aceptado");
        } else {
            System.out.println("No aceptado");
        }














    }





    





}
