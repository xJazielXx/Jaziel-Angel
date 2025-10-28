

package p120_Interfaces;

public class Maquina {
    protected String nombre;
    protected String propietario;
    protected int pasajeros;
    
    public Maquina(String nombre, String propietario, int pasajeros){
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }
    
    public Maquina(){
        // Constructor vacío
    }
    
    public void repostar(){
        System.out.println("Reposando");
    } 
    
    public void arrancar(){
        System.out.println("Arrancando");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
    
   
}