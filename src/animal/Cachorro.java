package animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }
    public  void abanarRabo(){
        System.out.println("Cachorro abanando o rabo.");
    }
}
