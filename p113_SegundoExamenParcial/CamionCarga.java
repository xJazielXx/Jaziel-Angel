package p113_SegundoExamenParcial;

public class CamionCarga extends Vehiculo {
    int Ejes;
    double Kilometraje;
    public CamionCarga(String marca, String modelo, int capacidad, double costoBase, int ejes, double kilometraje) {
        super(marca, modelo, capacidad, costoBase);
        Ejes = ejes;
        Kilometraje = kilometraje;

        calcularCostoTotal();
    }


    public double getBonoConductor(){
        return (CostoBase *0.10) + (Ejes * 50 ) + (Kilometraje *0.5);
        
    }


    public int getEjes() {
        return Ejes;
    }


    public double getKilometraje() {
        return Kilometraje;
    }
    public String toString() {
        return "=== CAMIÓN DE CARGA ===\n" +
               "Marca: " + Marca + "\n" +
               "Modelo: " + Modelo + "\n" +
               "Capacidad: " + Capacidad + " kg\n" +
               "Ejes: " + Ejes + "\n" +
               "Kilometraje: " + Kilometraje + " km\n" +
               "Costo Base: $" + CostoBase + "\n" +
               "Bono Conductor: $" + getBonoConductor() + "\n" +
               "Costo Total: $" + CostoTotal;
    }
    
    
    


    
}
