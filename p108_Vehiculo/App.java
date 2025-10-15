package p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Datos de los vehiculos de la flota\n");

        Compacto compacto1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22,4,2);
        Compacto compacto2 = new Compacto("CP1000145555","Nissan", 2010,54500.33,6,4);
        Camioneta camioneta1 = new Camioneta ("CA104014544", "Dina",2008, 234567.15,450.0,4);
        Camioneta camioneta2 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        

        System.out.println(compacto1.toString());
        System.out.println(compacto2.toString());             
        System.out.println(camioneta1.toString()); 
        System.out.println(camioneta2.toString());

        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(compacto1);
         vehiculos.add(compacto2);
          vehiculos.add(camioneta1);
           vehiculos.add(camioneta2);
           
           
        System.out.println("Calculando el total de precio de todos los veiculos..");
        double total=0;
        for( Vehiculo vehiculo : vehiculos ){
            System.out.println(vehiculo.getPrecio());
            total += vehiculo.getPrecio();

        }
        System.out.println("\nLa suma de los precios es: " + total);
        
        



        
    }
    
}
