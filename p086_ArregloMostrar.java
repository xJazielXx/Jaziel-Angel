public class p086_ArregloMostrar {

    
        
        public static void Mostrar(int[] a){
            for(int i=0; i<a.length; i++)
            System.out.print(a[i]+"");
        }
        public static void Cuadrado(int [] a){
            for( int i=0; i<a.length; i++)
            a[i]= a[i]*a[i];
        }
        public static void main(String[] args) {
            
            int[] A= {2,4,6,8,3,5,7};

            System.out.println("\nElementos del arrgelo A y el cuadradao de A");
            Mostrar(A);
            System.out.println("\nElementos del arrgeglo A y el cuadrado");
            Cuadrado(A);
            Mostrar(A);
        }



}
    

