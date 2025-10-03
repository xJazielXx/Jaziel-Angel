package p095_Empleado02;

public class Empleado {
    private String Nombre;
    private int Edad;

    public int getEdad(){
        return Edad;

    }
    public void setEdad(int edad){
        Edad = edad;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        Nombre = nombre;

    }
    public String toString(){
        return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }


    
}
