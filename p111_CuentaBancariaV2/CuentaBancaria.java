package p111_CuentaBancariaV2;

public abstract class CuentaBancaria { //una clase abstracta no se puede instanciar, solo sirve como molde
    protected double Saldo; //Una propieda protected puede ser accedidad desde las clases heredadas 

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }
    public void deposita(double cantidad){
        Saldo += cantidad;
    }
    public abstract boolean retira(double cantidad); // Un metodo abstracto no se codifica aqui, se tiene que implementar luego

    
    public String toString() {
        return "CuentaBancaria [Saldo=" + Saldo + "]";
    }
    
    
}
