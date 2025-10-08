package p102_AutorLibro;



public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro("HACK123456", "Hacking Exposed 4", 1200, 3, new Autor("Chema venegas","Chema@hotmail.com",50));
        System.out.println(libro1);

        Libro libro2 = new Libro("AA3456", "Algebra", 1200, 3, new Autor("Baldor", "baldoe@gmail.com",60));
        System.out.println(libro2);

        //Actualizamos nuevos numeros
        libro2.setCantidad(10);
        libro2.setPrecio(2400);
        System.out.println();
        System.out.println(libro2);

        System.out.println("\nDatos dell libro 2 por separado\n");
        System.out.println("Isbn       : " + libro2.getIsbn());
        System.out.println("Nombre     : " + libro2.getNombre());
        System.out.println("Precio     : " + libro2.getPrecio());
        System.out.println("Cantidad   : " + libro2.getCantidad());
        System.out.println("Datos del autor del libro2");
        System.out.println("Nombre     : " + libro2.getAutor().getNombre());
        System.out.println("Correo     : " + libro2.getAutor().getCorreo());
        System.out.println("Edad       : " + libro2.getAutor().getEdad());



    
    }
    
}
