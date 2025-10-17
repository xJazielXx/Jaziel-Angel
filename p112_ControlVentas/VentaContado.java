package p112_ControlVentas;

public class VentaContado extends Venta{
    private float Descuento;
    private String Regalo;

    public VentaContado(String articulo, float cantidad, float precio, float descuento, String regalo) {
        super(articulo, cantidad, precio);
        Descuento = descuento;
        Regalo = regalo;
    }
    public  float getTotalVenta(){
        return Total - Total * (Descuento/100);
    }

    public String toString(){
        return "VentaContado [" + super.toString() + ",Descuento=" + String.format("%.2f%%", Descuento) + "Regalo" + Regalo + ", Total Venta=" + String.format("%.2f", this.getTotalVenta()) + "]";
    }
    
    
    
}
