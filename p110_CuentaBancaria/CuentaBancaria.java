package p110_CuentaBancaria;

public class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void deposita(double cantidad) {
        Saldo += cantidad;

    }

    public boolean retira(double cantidad){
        if (cantidad <= Saldo){
            Saldo -= cantidad;
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
