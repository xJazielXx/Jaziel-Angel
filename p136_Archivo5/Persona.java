package p136_Archivo5;
import java.io.Serializable;

public class Persona implements Serializable{  //Permite que la clase se convierta en bytes para ser escritos en disco
    private String Nombre;
    private int Edad;
    private double Peso;
    private String Correo;
    


    public Persona() {
    }




    public String getNombre() {
        return Nombre;
    }




    public void setNombre(String nombre) {
        Nombre = nombre;
    }




    public int getEdad() {
        return Edad;
    }




    public void setEdad(int edad) {
        Edad = edad;
    }




    public double getPeso() {
        return Peso;
    }




    public void setPeso(double peso) {
        Peso = peso;
    }




    public String getCorreo() {
        return Correo;
    }




    public void setCorreo(String correo) {
        Correo = correo;
    }




    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + ", Correo=" + Correo + "]";
    }
    
    
    
    
    
}
