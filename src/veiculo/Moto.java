package veiculo;

public class Moto  extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("ligando a moto.");
    }

    @Override
    public void desligar() {
        System.out.println("desligando a moto");
    }
}
