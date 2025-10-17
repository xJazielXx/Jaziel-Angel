package p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    public Tienda(String nombre, String propietario, String domicilio) {
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
        Clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        Clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes(){
        return Clientes;
    }

    public float getTotal(){
        float totalTienda= 0;
        for(Cliente cliente : Clientes){
            totalTienda += cliente.getTotal();
        }
        return totalTienda;
    }
    public void reporte(){//Mostrar cada cliente y de cliente sus ventas
        System.out.println("=".repeat(50));
        System.out.println("Reporte de ventas de la tienda "+ this.toString());
        System.out.println("=".repeat(50));
        for(Cliente cliente : Clientes){
            System.out.println(">>"+ cliente.toString());
            for(Venta venta : cliente.getVentas()){
                System.out.println(venta.toString());
            }
            System.out.println();
        }
    }
    
   
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes="
                + Clientes.size() + ",Total=" +    "]";
    }
    


    
    
}
