package p145_ControlEstudiante;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estudiante implements Serializable {
    private String Nombre;
    private int Edad;
    private float Peso;
    private String Correo;
    private LocalDate FechaNacimiento;
    private String Sexo;
    private float Promedio;

    public Estudiante(String Nombre, int Edad, float Peso, String Correo, LocalDate FechaNacimiento, String Sexo, float Promedio) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.Promedio = Promedio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Estudiante{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Correo='" + Correo + '\'' +
                ", FechaNacimiento=" + FechaNacimiento.format(formatter) +
                ", Sexo='" + Sexo + '\'' +
                ", Promedio=" + Promedio +
                '}';
    }
}