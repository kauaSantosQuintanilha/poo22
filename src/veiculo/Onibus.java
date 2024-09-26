package veiculo;

public class Onibus extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("ligando o ônibus.");
    }

    @Override
    public void desligar() {
        System.out.println("onibus desligado.");
    }
}
