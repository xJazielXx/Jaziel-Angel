package p113_SegundoExamenParcial;

public class AutobusPasajeros  extends Vehiculo{
    int Rutas;
    int PasajerosTransportados;
    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase, int rutas,
            int pasajerosTransportados) {
        super(marca, modelo, capacidad, costoBase);
        Rutas = rutas;
        PasajerosTransportados = pasajerosTransportados;
    }
    public double getBonoConductor(){
        return (CostoBase * 0.15) + (Rutas *120)+ (PasajerosTransportados * 0.1);
    }
    @Override
    public String toString() {
        return "=== AUTOBÚS DE PASAJEROS ===\n" +
               "Marca: " + Marca + "\n" +
               "Modelo: " + Modelo + "\n" +
               "Capacidad: " + Capacidad + " pasajeros\n" +
               "Rutas: " + Rutas + "\n" +
               "Pasajeros Transportados: " + PasajerosTransportados + "\n" +
               "Costo Base: $" + CostoBase + "\n" +
               "Bono Conductor: $" + getBonoConductor() + "\n" +
               "Costo Total: $" + CostoTotal;
    }


    

    
}
