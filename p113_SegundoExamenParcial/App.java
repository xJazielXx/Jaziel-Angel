package p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {
// Limpiar la consola (opcional)
// System.out.print("\033[H\033[2J");System.out.flush();
Flota miFlota = new Flota("División Norte", "Monterrey");
System.out.println("\033[H\033[2J");
// Reporte inicial (debe mostrar 0 vehículos)
System.out.println("--- Reporte Inicial ---\n");
System.out.println(miFlota.toString());
System.out.println();
// -----------------------------------------------------------------
// Agregar Camiones de Carga
// CostoBase, Ejes, Kilometraje
miFlota.agregarVehiculo(new CamionCarga("Volvo", "FMX", 30000, 2500.0, 4, 5000.0));
miFlota.agregarVehiculo(new CamionCarga("Kenworth", "T680", 25000, 1800.0, 3, 4200.0));
// Agregar Autobuses de Pasajeros
// CostoBase, Rutas, PasajerosTransportados
miFlota.agregarVehiculo(new AutobusPasajeros("Mercedes", "O500", 50, 1200.0, 5, 8500));
miFlota.agregarVehiculo(new AutobusPasajeros("Irizar", "i6", 40, 1500.0, 8, 12000));
miFlota.agregarVehiculo(new AutobusPasajeros("Scania", "K360", 45, 950.0, 4, 6200));
// -----------------------------------------------------------------
// Reporte final y totales
System.out.println("--- Reporte Final con Datos de Prueba ---\n");
miFlota.reporte();
}


    
}
