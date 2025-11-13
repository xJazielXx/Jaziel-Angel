package p145_ControlEstudiante;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Utileria {

    public void grabarDatos(String archivo, ArrayList<Estudiante> datos) {
        try (FileOutputStream fileOut = new FileOutputStream(archivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Estudiante> leerDatos(String archivo) {
        ArrayList<Estudiante> datos = null;
        try (FileInputStream fileIn = new FileInputStream(archivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            datos = (ArrayList<Estudiante>) objectIn.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public ArrayList<Estudiante> inicializar() {
        ArrayList<Estudiante> listaEjemplo = new ArrayList<>();
        
        listaEjemplo.add(new Estudiante("Ana Lopez", 20, 60.5f, "ana.l@ejemplo.com", LocalDate.of(2004, 5, 15), "Femenino", 9.2f));
        listaEjemplo.add(new Estudiante("Luis Garcia", 22, 75.2f, "luis.g@ejemplo.com", LocalDate.of(2002, 11, 30), "Masculino", 8.5f));
        listaEjemplo.add(new Estudiante("Maria Torres", 19, 55.0f, "maria.t@ejemplo.com", LocalDate.of(2005, 8, 25), "Femenino", 9.8f));
        listaEjemplo.add(new Estudiante("Carlos Ruiz", 21, 80.7f, "carlos.r@ejemplo.com", LocalDate.of(2003, 3, 10), "Masculino", 7.9f));
        listaEjemplo.add(new Estudiante("Sofia Perez", 20, 58.9f, "sofia.p@ejemplo.com", LocalDate.of(2004, 1, 5), "Femenino", 9.5f));

        return listaEjemplo;
    }
}
