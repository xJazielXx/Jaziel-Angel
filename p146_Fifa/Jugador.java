package p146_Fifa;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jugador implements Serializable {
    // Campos del jugador según la imagen
    private String Nombre;
    private String Nacionalidad;
    private float Peso; // Peso (kg)
    private LocalDate FechaNacimiento; // F. Nacimiento (YYYY-MM-DD)
    private String Posicion;
    private String Pie; // Pie Preferido
    private int Rating; // Rating (1-99)

    public Jugador(String Nombre, String Nacionalidad, float Peso, LocalDate FechaNacimiento, String Posicion, String Pie, int Rating) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Peso = Peso;
        this.FechaNacimiento = FechaNacimiento;
        this.Posicion = Posicion;
        this.Pie = Pie;
        this.Rating = Rating;
    }

    // --- Getters y Setters ---

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getPie() {
        return Pie;
    }

    public void setPie(String Pie) {
        this.Pie = Pie;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        // Asegurarse de que el Rating esté en el rango 1-99
        if (Rating >= 1 && Rating <= 99) {
            this.Rating = Rating;
        } else {
            // Manejo de error o valor por defecto si es necesario
            System.err.println("Advertencia: El Rating debe estar entre 1 y 99.");
            this.Rating = Math.max(1, Math.min(99, Rating)); // Clampeando el valor
        }
    }

    @Override
    public String toString() {
        // El formato de fecha en la imagen es YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Jugador{" +
                "Nombre='" + Nombre + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", Peso=" + Peso +
                ", FechaNacimiento=" + FechaNacimiento.format(formatter) +
                ", Posicion='" + Posicion + '\'' +
                ", Pie='" + Pie + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}