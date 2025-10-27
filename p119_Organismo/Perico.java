package p119_Organismo;

public class Perico extends Organismo implements Ave{
    public Perico(String nombre){
        super(nombre);
    }

    @Override
    public void multicelular() {
        System.out.println("Es un anumal multicelular, es un perico");
        
        
    }

    @Override
    public void sangreCaliente() {
      System.out.println("Es un animal de sangre caliente es un perico");
        
    }

    @Override
    public void dosPatas() {
       System.out.println("Es un ave y camina en dos Patas es un perico");
    }

    @Override
    public void volar() {
System.out.println("Es un ave puede volar es un perico ");
    }
    
}
