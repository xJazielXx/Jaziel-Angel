package p120_Interfaces;


public class App {
    public static void main(String[] args) {
        // ✅ CORREGIDO - usar la misma variable
        Sedan minaquina = new Sedan("Vocho", "Maria", 4);
        System.out.println(minaquina.toString()); 
        minaquina.sistemaElectrico(); 
        minaquina.combustionInterna(); 
        minaquina.carroceriaTres();
        minaquina.chasisMonocasco();
        minaquina.repostar();
        minaquina.arrancar();
        minaquina.frenar();
        
        System.out.println();
        
        Suv minaquina2 = new Suv("La mamalona", "Carlos Castañeda", 6);
        System.out.println(minaquina2.toString());
        minaquina2.sistemaElectrico(); 
        minaquina2.combustionInterna(); 
        minaquina2.traccion4x4(); 
        minaquina2.chasisIndependiente();
        minaquina2.repostar();
        minaquina2.arrancar();
        minaquina2.frenar();
    } 
}