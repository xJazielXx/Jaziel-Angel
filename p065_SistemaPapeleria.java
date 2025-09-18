import java.util.Scanner;

public class p065_SistemaPapeleria {
    public static void main(String[] args) {
        int cventas=1, cantidad=1, total=0;
        char resp, tipocopia;
        int tcc=0, tco=0, tcd=0;
        
        Scanner obj= new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.println("Papeleria La Cartulina");
        System.out.println("Venta de fotocopiass la menudeo");


        do {
            cventas++;
            System.out.printf("Venta %d", cventas);
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            tipocopia = Character.toUpperCase(obj.next().charAt(0));
            System.out.println("Cantidad? ");
            cantidad = obj.nextInt();
            switch (tipocopia) {
                case 'C':
                tcc+=cantidad;
                break;

                case 'o':
                tco+=cantidad;
                break;

                case 'd':
                tcd+=cantidad;
                break;
            }
            System.out.print("Deseas continuar? (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));

        }while(resp!='N');

        System.out.println("\n");
        System.out.println("Resumen de ventas Diario");
        System.out.printf("Ventas realizadas : %d \n", cventas);
        System.out.printf("\nCarta          :%,10d u - $%,10d\n",tcc,tcc*3);
        System.out.printf("Oficio           :%,10d u - $%,10d\n", tco, tco*4);
        System.out.printf("Doble oficio     :%,10  u - $%,10d\n", tcd, tcd*6);


        total = tcc*3 + tco*4 + tcd*6;

        System.out.printf("Total de venta   : %,10d", total);
        System.out.println("\nEsta vebta es una : ");

        if(total<50) System.out.println("Venta moderada ");

        else if (total<101) System.out.println("Venta frecuente ");
        
            else System.out.println("Venta superada ");
    
    
    }


    
    
}
