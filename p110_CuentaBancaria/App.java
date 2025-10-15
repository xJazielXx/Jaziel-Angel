package p110_CuentaBancaria;

public class App {
    public static void main(String[] args) {

        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del deposito :"+ c1.getSaldo());
        double cr = 4000;
        boolean retiro = c1.retira(cr);
        if ( retiro) System.out.println("Retiro de "+ cr + "efectuado con exito, nuevo saldo "+ c1.getSaldo());
        else System.out.println("Ni pa los cigarros tienes");



        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 1 :" + cliente1.toString());
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println("Cliente 2: " + cliente2);
        double noretiro = 50;
        cliente2.getCuenta().retira(noretiro);
        if(cliente2.getCuenta().retira(noretiro))
        System.out.println("El retiro de " + noretiro + "efectuado con exito, nuevo saldo" + cliente2.getCuenta());
        else System.out.println("No tienes money mi rei XD");

        System.out.println("\n Probando clase Banco");
        Banco mibanco = new Banco("Banco Patito SA de CV","Arboledas 124");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente ("Felipe correa", new CuentaBancaria(2000));
        mibanco.agregarCliente(cliente3);
        mibanco.getClientes().get(0).getCuenta().deposita(1500);
        mibanco.getClientes().get(1).getCuenta().retira(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);
        System.out.println("\nResumen del Banco \n");
        System.out.println(mibanco);
        double totalbanco = 0.0;
        for(Cliente cliente : mibanco.getClientes()) {
        System.out.println(cliente);
        totalbanco += cliente.getCuenta().getSaldo();

}
System.out.println("\nTotal de dinero en el Banco : " + totalbanco);






        

    }


    
}
