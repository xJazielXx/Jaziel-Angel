package p112_ControlVentas;

public class VentaCredito extends Venta {//Agregamos Meses y intereses a Venta
    private int Meses;
    private float Interes;
    public VentaCredito(String articulo, float cantidad, float precio, int meses, float intereses) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Interes = intereses;
    }

    public float getTotalVenta(){
        return Total + ( Total * ( Meses *(Interes/100) ) );
    }

    public String toString(){
        return "VentaCredito [" + super.toString() + ", Meses=" + Meses +  ",Interes=" + Interes + ",Total Ventas=" +
        String.format("%.2f", this.getTotalVenta()) + "]";
    }
    
}
