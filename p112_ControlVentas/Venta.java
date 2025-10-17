package p112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private float Cantidad;
    private float Precio;
    protected float Total;

    public Venta(String articulo, float cantidad, float precio){
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = Cantidad * precio;
        }
        public abstract float getTotalVenta();
        @Override

        public String toString() {
            return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + String.format("%.2f",Total)
                    + "]";
        }

        

    
}
