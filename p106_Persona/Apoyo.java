package p106_Persona;

public class Apoyo extends  Persona {
    protected String Escolaridad;
    protected double Paga;
    public Apoyo(){

    }


    public Apoyo(String nombre, String direccion, String escolaridad, double paga) {
        super(nombre, direccion);
        Escolaridad = escolaridad;
        Paga = paga;
    }
    

    public Apoyo(Persona persona,String escolaridad, double paga) {
        Escolaridad = escolaridad;
        Paga = paga;
    }


    public String getEscolaridad() {
        return Escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }

    public double getPaga() {
        return Paga;
    }

    public void setPaga(double paga) {
        Paga = paga;
    }


   
    public String toString() {
        return "Apoyo [Escolaridad=" + Escolaridad + ", Paga=" + Paga + "]";
    }
    
    

    
    
}
