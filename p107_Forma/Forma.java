package p107_Forma;
                                //Esta es una clase abstracta
public abstract  class Forma { //no podre creas objeetos directamente de esta clase


    private String Color;

    public Forma(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    
    public abstract double getArea();
    
     

    
}
