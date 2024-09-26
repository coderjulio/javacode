package animal_9.teste;

import animal_9.dominio.Cachorro;
import animal_9.dominio.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();

        dog.som();
        System.out.println("cachorro está andando...");
        System.out.println(dog.mover() + " passos");
        System.out.println(dog.mover() + " passos");
        System.out.println("=============");
        cat.som();
        System.out.println("gato está andando...");
        System.out.println(cat.mover() + " passos");
        System.out.println(cat.mover() + " passos");
    }
}
