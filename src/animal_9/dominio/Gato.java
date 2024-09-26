package animal_9.dominio;

public class Gato extends Animal {

    @Override
    public void som() {
        System.out.println("Miau!");
    }

    int anda;
    @Override
    public int mover() {
        return anda += 7;
    }
}
