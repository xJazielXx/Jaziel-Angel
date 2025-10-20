package p113_SegundoExamenParcial;

public abstract class Vehiculo {
    protected String Marca;
    protected String Modelo;
    protected int Capacidad;
    protected double CostoBase;
    protected double CostoTotal;

    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Capacidad = capacidad;
        this.CostoBase = costoBase;
    }

    // Método abstracto 
    public abstract double getBonoConductor();

    // Método para calcular el costo total 
    public void calcularCostoTotal() {
        this.CostoTotal = this.CostoBase + getBonoConductor();
    }

    
    @Override
    public String toString() {
        return "Vehículo: " + Marca + " " + Modelo + 
               "\nCapacidad: " + Capacidad + 
               "\nCosto Base: $" + CostoBase + 
               "\nBono Conductor: $" + getBonoConductor() + 
               "\nCosto Total: $" + CostoTotal;
    }

    // Getters y Setters (opcionales pero recomendados)
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public double getCostoBase() {
        return CostoBase;
    }

    public void setCostoBase(double costoBase) {
        CostoBase = costoBase;
    }

    public double getCostoTotal() {
        return CostoTotal;
    }
}