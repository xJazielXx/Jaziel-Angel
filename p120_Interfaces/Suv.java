package p120_Interfaces;

public class Suv extends Maquina implements TodoTerrreno {
  public Suv(String nombre, String propietario, int pasajeros){
       
    }

    @Override
    public void  sistemaElectrico() {
       System.out.println("Es un automovil con sistema electrico es una Suv");
        
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es una automovil de combustion interna es una Suv");
        
    }

    @Override
    public void traccion4x4() {
       System.out.println("Es un automovil con traccion 4x4 es una Suv");
        
    }

    @Override
    public void chasisIndependiente() {
      System.out.println("Es un automovil con chaisis independiente es una Suv");
        
    }
    public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }
    
    
    
}
