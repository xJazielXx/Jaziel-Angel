package p119_Organismo;

public class Organismo {
    private String Nombre;
    public Organismo(String nombre){
        Nombre=nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public void respiracion(){
        System.out.println("Respirando");
    }
    public void movimiento(){
        System.out.println("Moviendose");
    }
    public void crecimiento(){

        System.out.println("Creciendo..");
    }
    
}
