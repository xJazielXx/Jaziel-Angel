package p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        // Objetos sin datos
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();  

        // Le damos valores a los objetos 
        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(2000);

        persona1.setNombre("Jamile Lopez");
        persona1.setTrabajo(trabajo.getRol());  

        System.out.println(persona1.toString());
    }
}