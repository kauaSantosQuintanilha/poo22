package contaBancaria;

public class contaCorrente extends  ContaBancaria {
    @Override
    public void depositar() {
        double deposito;
        deposito = 200;
        System.out.println("fazendo deposito.");
    }

    @Override
    public void sacar() {
        double saque;
        saque = 20;
        System.out.println("Fazendo saque." + saque);
    }

    @Override
    public void consultarSaldo() {
        double saldo = 200 - 20 - 10;
        System.out.println("seu saldo é:" + saldo);

    }

    public double cobrarTarifaMensal(double saldo) {
        double tarifa = 10;
        saldo = 200 - 20 - 10;
        System.out.println("tarifa de 10 reias mensal,com isso seu saldo ficoi:" + saldo);


        return tarifa;
    }
}