package p099_Rectangulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;
    //Constructor
    public Rectangulo(){

    }
    public Rectangulo(float largo, float ancho){
        Largo = largo;
        Ancho = ancho;

    }
    public float getLargo(){
        return Largo;
    }
    public void setLargo(float largo){
        Largo = largo;
    }
    public float getAncho(){
        return Ancho;
    }
    public void setAncho(float ancho){
        Ancho = ancho;
    }
    //Metodos programados por el usuario
    public float getArea(){
        return Largo * Ancho;
    }
    public float getPerimetro(){
        return 2* (Largo + Ancho );
    }
    //Metodo de salida
    public String toString(){
        return "Rectangulo [Largo =" + Largo +", Ancho=" + Ancho +"]";
    }
    
}
