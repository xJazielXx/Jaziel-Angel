package p120_Interfaces;

public class Sedan extends Maquina implements Familiar{
    public Sedan(String nombre, String propietario, int pasajeros){
       
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico es un Sedan");
        
        
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil de combustion interna es un Sedan");
        
    }

    @Override
    public void carroceriaTres() {
       System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedasl");

        
    }

    @Override
    public void chasisMonocasco() {
       System.out.println("Es un tipo familiara con chasis monocasco es un Sedan");
        
    }

   public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }
    

    
    
}
