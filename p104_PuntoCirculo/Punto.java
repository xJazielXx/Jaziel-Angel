package p104_PuntoCirculo;

public class Punto {
    private int Y;
    private int X;
    public Punto() {
    }
    public Punto(int y, int x) {
        Y = y;
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public double getDistancia(Punto punto){
    return Math.sqrt(Math.pow(punto.X - this.X, 2) + Math.pow(punto.Y - this.Y, 2));
}
    
    public String toString() {
        return "Punto [Y=" + Y + ", X=" + X + "]";
    }

    

    

    
}
