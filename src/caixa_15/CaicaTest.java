package caixa_15;

public class CaicaTest {
    public static void main(String[] args) {

        Caixa<String> caixa = new Caixa<>();
        caixa.inserir("Tênis");
        caixa.inserir("Meias");
        System.out.println("Objeto na caixa: " + caixa.getObjetos());
        caixa.retirar("Meias");
        System.out.println("Objeto na caixa: " + caixa.getObjetos());
        System.out.println("A caixa está vazia? " + caixa.estaVazia());
    }
}
