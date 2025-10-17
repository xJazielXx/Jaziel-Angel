package p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas; // el cliente podara tener varias cuentas
    public Cliente(String nombre, String domicilio, String correo) {
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
        Ventas = new ArrayList<>();
    }
    public void agregarVenta(Venta venta){//agrega una venta al arreglo de ventas
        Ventas.add(venta);
    }
    public ArrayList<Venta> getVentas(){// lo regresa todo al arreglo de ventas 
        return Ventas;
    }
    public float getTotal(){
        float totalVentasCliente=0;
        for(Venta venta: Ventas){
            totalVentasCliente += venta.getTotalVenta();
        }
        return totalVentasCliente;

    }
    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + Ventas.size() + ", total=" + String.format("%,.2f", getTotal())
                + "]";
    }
    


    
    
    
}
