package operacoes_11;

public class Teste {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b;
        System.out.println("Soma: " + soma.executar(5, 3));

        Operacao subtracao = (a, b) -> a - b;
        System.out.println("Subtração: " + subtracao.executar(5, 3));

        Operacao multiplicacao = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicacao.executar(5, 3));
    }
}
