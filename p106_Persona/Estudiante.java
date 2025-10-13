package p106_Persona;


public class Estudiante extends Persona{
    private String Carrera;
    private double Cuota;
    

    public Estudiante(String nombre, String trabajo, String carrera, double cuota) {
        super(nombre, trabajo);
        Carrera = carrera;
        Cuota = cuota;
    }


    public String getCarrera() {
        return Carrera;
    }


    public void setCarrera(String carrera) {
        Carrera = carrera;
    }


    public double getCuota() {
        return Cuota;
    }


    public void setCuota(double cuota) {
        Cuota = cuota;
    }


    @Override
    public String toString() {
        return "Estudiante [Carrera=" + Carrera + ", Cuota=" + Cuota + "]";
    }
    
    
    
    


    
}
