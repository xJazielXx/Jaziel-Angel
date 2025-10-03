package p096_Empleado03;

public class App {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan Perez",35);
        System.out.println(empleado1.toString());

        Empleado empleado2= new Empleado("Maria de Jesus",16);
        System.out.println(empleado2.toString());

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Dario Jimenez");
        empleado3.setEdad(33);
        System.out.println(empleado3.toString());

        System.out.println("Nombre"+empleado1.getNombre());
        System.out.println("Edad"+empleado1.getEdad());
        



    }
    

}
