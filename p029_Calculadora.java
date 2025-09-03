import java.util.Scanner;


public class p029_Calculadora{
    public static void main(String[] args) {
        double num1, num2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Efectua operaciones con dos numeros\n");

        System.err.println("Dame numero 1 ");
        num1 = obj.nextDouble();

        System.out.println("Dime el numero 2 ");
        num2 = obj.nextDouble();
        System.out.println("Que operacion quieres (+ - * / ^) ? ");
        op = obj.next().charAt(0);
        switch (op) {

            case '+':
            System.out.printf("num1 + num2 = %.2f", num1 + num2);
            break;
        
            case '-':
            System.out.printf("num1 - num2 = %.2f", num1 - num2);
            break;

            case '*':
            System.err.printf("num1 * num2 = %.2f", num1 * num2);
            break;

            case '/':
            System.out.printf("num1 / num2 = %.2f", num1 / num2);
            break;

            case '^':
            System.out.printf("num1 ^ num2 = %.2f", Math.pow(num1,num2));
            break;

            


        




        }
     System.out.println("\n\nProceso terinado");






    }



}


