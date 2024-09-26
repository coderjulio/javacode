package animal_9.dominio;

public class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("Roof Roof!");
    }

    int anda;
    @Override
    public int mover() {
        return anda += 10;
    }
}
