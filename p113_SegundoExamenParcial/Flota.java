package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Flota {
    String Nombre;
    String Ciudad;
    private ArrayList<Vehiculo> Vehiculos;

    public Flota(String nombre, String ciudad) {
        this.Nombre = nombre;
        this.Ciudad = ciudad;
        this.Vehiculos = new ArrayList<>();
    }

    // Método para agregar vehículos al arreglo
    public void agregarVehiculo(Vehiculo vehiculo) {
        Vehiculos.add(vehiculo);
    }

    public Flota(String nombre, String ciudad, ArrayList<Vehiculo> vehiculos) {
        Nombre = nombre;
        Ciudad = ciudad;
        Vehiculos = vehiculos;
    }
    public double getTotalBono(){
        double totalBono = 0;
        for (Vehiculo vehiculo : Vehiculos) {
            totalBono += vehiculo.getBonoConductor();
        }
        return totalBono;
    }

    // Suma de todos los CostoTotal de los vehículos
    public double getTotalCosto() {
        double totalCosto = 0;
        for (Vehiculo vehiculo : Vehiculos) {
            totalCosto += vehiculo.getCostoTotal();
        }
        return totalCosto;
    }

    // Cuenta el total de camiones de carga
    public int getNumCamiones() {
        int cont = 0;
        for (Vehiculo vehiculo : Vehiculos) {
            if (vehiculo instanceof CamionCarga) {
                cont++;
            }
        }
        return cont;
    }

    // Cuenta el total de autobuses de pasajeros
    public int getNumAutobuses() {
        int cont = 0;
        for (Vehiculo vehiculo : Vehiculos) {
            if (vehiculo instanceof AutobusPasajeros) {
                cont++;
            }
        }
        return cont;
    }

    // Imprime el reporte 
    public void reporte() {
        System.out.println("=== REPORTE DETALLADO DE FLOTA ===");
        System.out.println("División: " + Nombre);
        System.out.println("Ciudad: " + Ciudad);
        System.out.println("===================================");
        
        for (int i = 0; i < Vehiculos.size(); i++) {
            System.out.println("Vehículo #" + (i + 1) + ":");
            System.out.println(Vehiculos.get(i).toString());
            System.out.println("-----------------------------------");
        }
        
        System.out.println("=== RESUMEN FINAL ===");
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "RESUMEN FLOTA:\n" +
               "Nombre: " + Nombre + "\n" +
               "Ciudad: " + Ciudad + "\n" +
               "Total Vehículos: " + Vehiculos.size() + "\n" +
               "Camiones de Carga: " + getNumCamiones() + "\n" +
               "Autobuses de Pasajeros: " + getNumAutobuses() + "\n" +
               "Total Bonos Conductores: $" + getTotalBono() + "\n" +
               "Total Costos Operación: $" + getTotalCosto();
    }

    
    public String getNombre() {
        return Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return Vehiculos;
    }
}
       
    



    

