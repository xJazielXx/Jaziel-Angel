public class p121_Excepcion {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        
        try{
            int r = a/b;
            System.out.println("El resultado es" + r);
        }catch (Exception e){
            System.out.println("No se puede dividir entre cero papito, seguro que fuiste fuiste a la escuela??");
        }

    }
    
}
