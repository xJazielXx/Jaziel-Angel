package p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        // Venta miventa = new Venta() // no se puede instanciar por que es una clase abstracta

        // Se crea la tienda
        Tienda mitienda = new Tienda("Don Lupe", "Guadalupe Ortiz", "Calle Fronter 134");
        // Se agregan clientes a la tienda
        mitienda.agregarCliente(new Cliente("Felipe Calderon", "Lomas Altas 123", "calde@msn.com"));
        mitienda.agregarCliente(new Cliente("Enrique Pena", "5 de Mayo 321", "gujque@gmail.com"));
        mitienda.agregarCliente(new Cliente("Andres Lopez", "La chingada 156", "lopecillos@yahoo.com.com"));
        mitienda.agregarCliente(new Cliente("Xochit! Gelatinas", "Danone 357", "xochotl@hotmail.com"));
        // Primer reporte
        mitienda.reporte();

        // Agregar Ventas a los clientes
        // Agregamos ventas al cliente 1 - Felipe Calderon
        mitienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo",10,60.5f,10,"Sacabrocados"));
        mitienda.getClientes().get(0).agregarVenta(new VentaCredito("Pala",2,1170.55f,3,10));
        // Agregamos ventas al cliente 2 - Enrique Pena
        mitienda.getClientes().get(1).agregarVenta(new VentaCredito("Clavo", 2.5f, 160.34f, 2, 20));
        mitienda.getClientes().get(1).agregarVenta(new VentaCredito("Cinta de Aislar", 5, 71.34f, 6, 20));
        mitienda.getClientes().get(1).agregarVenta(new VentaContado("Pinzas", 10, 650.33f, 20, "Taladro"));
        // Agregamos ventas al cliente 3 - Andres Lopez
        mitienda.getClientes().get(2).agregarVenta(new VentaContado("Thiner", 50, 65.00f, 10, "Aerosol"));
        // Segundo reporte
        mitienda.reporte();
    }
}