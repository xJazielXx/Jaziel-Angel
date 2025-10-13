package p106_Persona;

public class Persona {
    private String Nombre;
    private String Direccion;

    public Persona(){
        
    }
    

     


    public Persona(String nombre, String direccion) {
        Nombre = nombre;
        Direccion = direccion;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Direccion=" + Direccion + "]";
    }
    

    




    
}
