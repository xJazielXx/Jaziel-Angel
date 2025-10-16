package p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria{ //CuentaDeAhorro heredaa de CuentaBancaria (extends)
    private double TasaInteres;

    public CuentaDeAhorro(double saldo, double tasaInteres) { 
        super(saldo);  // se llama al constructor de la base
        TasaInteres = tasaInteres;
    }
    public void CalcularInteres(){
        Saldo += Saldo * TasaInteres;
    }
    

    public boolean retira(double cantidad){
        if( Saldo >= cantidad){
            Saldo -= cantidad;
            return true;
        }else return false;
    }
    @Override
    public String toString() {
        return "CuentaDeAhorro [Saldo=" + Saldo + ", TasaInteres=" + TasaInteres + "]";
    }

    
}
