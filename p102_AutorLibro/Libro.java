package p102_AutorLibro;

public class Libro {
    private String Isbn;
    private String Nombre;
    private double Precio;
    private int Cantidad;
    private Autor Autor;

    public Libro(String isbn, String nombre, double precio, int cantidad, p102_AutorLibro.Autor autor) {
        Isbn = isbn;
        Nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
        Autor = autor;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor autor) {
        Autor = autor;
    }

    
    public String toString() {
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Precio=" + Precio + ", Cantidad=" + Cantidad
                + ", Autor=" + Autor + "]";
    }
    

    
    
}
