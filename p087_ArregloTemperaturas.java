public class p087_ArregloTemperaturas {
    public static void Mostrar(double[] t){
        for(double v: t)
        System.out.print(v + "");
    }
    public static double Mayot(double[] t){
        double m= t[0];
        for(int i=0; i<t.length; i++)

        if(t[i]>m)m=t[i];

        return m;
    }
    public static double Promedio(double t[]){
        double s=0;
        for(int i=0; i<t.length; i++)
        s +=t[i];
        return s/t.length;

    
    }
    public static int Buscar(double t[], double b){
        int pos=-1;
        for(int i=0; i<t.length; i++)

        if(t[i]== b)
        pos=i;
        return pos;
    }
    public static void main(String[] args) {
        double[] temps={12,34,56.78,0.0,10.25,60,2.2};
        double temp= 10.25;
        int pos=0;
        
        System.out.println("Las temperaturas son: ");
        Mostrar(temps);
        System.out.printf("La temperatura mayor es : %.2f",Mayot(temps));
        System.out.printf("El promedio es: %.2f",Promedio(temps));
        pos=Buscar(temps, pos);
        
        if(pos!=-1)
        System.out.printf("La temperatura %.2f fue encontrado en la posicion %d", temp, pos);
        else
        System.out.println("El elemento no existe");
        
    }

    

}
