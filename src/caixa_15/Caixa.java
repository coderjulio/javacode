package caixa_15;

import java.util.ArrayList;
import java.util.List;

public class Caixa<T> {
    public List<T> getObjetos() {
        return objetos;
    }

    private List<T> objetos;

    public Caixa() {
        this.objetos = new ArrayList<>();
    }

    public void inserir(T objeto) {
        objetos.add(objeto);
    }

    public boolean retirar(T objeto) {
        return objetos.remove(objeto);
    }

    public boolean estaVazia() {
            return objetos == null;
    }
}