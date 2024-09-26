package veiculo;
// classe pai se utiliza abstract
//uma classe abstrata não pode gerar objeto
// apenas pode ser herdada
public abstract class Veiculo {
    public  abstract  void ligar();
    public  abstract  void desligar();
    public  void mover(){
        System.out.println("o veículo está se movendo.");
    }

}
