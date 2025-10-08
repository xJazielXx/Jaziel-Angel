package p101_TrabajoPersona;

public class Persona {
    private String Nombre;
    private String Trabajo;


    public Persona() {
    }


    public Persona(String nombre, String trabajo) {
        Nombre = nombre;
        Trabajo = trabajo;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getTrabajo() {
        return Trabajo;
    }


    public void setTrabajo(String trabajo) {
        Trabajo = trabajo;
    }


    
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Trabajo=" + Trabajo.toString() + "]";
    }
    
    


    
    
    
}
