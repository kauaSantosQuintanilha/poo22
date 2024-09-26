package veiculo;
//para fazer heranca se usa a palavra extends
public class Carro extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("ligando o carro!");
    }

    @Override
    public void desligar() {
        System.out.println("carro desligado.");
    }

}
