package p109_FormaV2;

public abstract class Forma {
    protected String Color;
    protected boolean Relleno;
    public Forma(String color, boolean relleno) {
        Color = color;
        Relleno = relleno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isRelleno() {
        return Relleno;
    }
    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }


    public abstract double getArea();

    
    public abstract double getPerimetro();

    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
    

    
    
}
