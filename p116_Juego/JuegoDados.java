package p116_Juego;
import java.util.Scanner;

public class JuegoDados implements Juego {// impelentamos jugar, finalizar, y jugar que pusimos en la interface Juego
    private int dado1, dado2;
    private String jugador1, jugador2;
    private Scanner teclado;
    public JuegoDados(){
        teclado = new Scanner(System.in);
    }
    @Override
    public void iniciar() {
        System.out.println("Jugadaor 1: ");
        jugador1=teclado.nextLine();
        System.out.println("jugador 2:");
        jugador2 = teclado.nextLine();
        
    }
    public void jugar() {
        dado1 = 1+(int)(Math.random()* 6);
        dado2 = 1+ (int)(Math.random()*6);
        System.out.println(jugador1 + "le salio el valor de "+ dado1);
        System.out.println(jugador2+ "a este le salio el "+ dado2);

        
    }
    @Override
    public void finalizar() {
       if(dado1>dado2)
       System.out.println("Gano el"+ jugador1+"con un valor de "+ dado1);
       else if(dado2 > dado1)
       System.out.print("Gano el "+ jugador2 + "Con un valor de "+ dado2);
       else System.out.println("Empataron los jugadores con el valor de "+ dado1);
        
    }
    

    
} 