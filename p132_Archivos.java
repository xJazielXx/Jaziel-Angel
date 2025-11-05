import java.io.File;

public class p132_Archivos {
    public static void main(String[] args) {
        File Archivo = new File("datos.txt");
        
        if(Archivo.exists()) {
            System.out.println("Nombre archivo : " + Archivo.getName() );
            System.out.println("Es directorio : " + Archivo.isDirectory() );
            System.out.println("Ruta relativa : " + Archivo.getPath() );
            System.out.println("Ruta absoluta : " + Archivo.getAbsolutePath() );
            System.out.println("El archivo existe !!");
            System.out.println("Se puede leer : " + Archivo.canRead() );
            System.out.println("Se puede escribir : " + Archivo.canWrite() );
            System.out.println("Longitud archivo : " + Archivo.length() );
            System.out.println("Longitud archivo : " + Archivo.lastModified() );

        }else {
            System.out.println("El archivo no existe");
        }
    }

    
}
