package p101_TrabajoPersona;

public class Trabajo {
    private int id;
    private String Rol;
    private double Salario;
    
    //constructor
    public Trabajo() {
    }

    public Trabajo(int id, String rol, double salario) {
        this.id = id;
        Rol = rol;
        Salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    
    public String toString() {
        return "Trabajo [id=" + id + ", Rol=" + Rol + ", Salario=" + Salario + "]";
    }
    

    

    





    

    
}
