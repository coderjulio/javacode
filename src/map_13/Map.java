package map_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        // Criação da lista de produtos
        List<Produto> produtos = Arrays.asList(
                new Produto("Computador", 1500.0),
                new Produto("Teclado", 90.0),
                new Produto("Mouse", 75.0),
                new Produto("Monitor", 200.0)
        );


        double valorReferencia = 100.0;

        produtos.stream()
                .filter(produto -> produto.getPreco() > valorReferencia)
                .map(Produto::getNome) // Extrai apenas o nome dos produtos
                .forEach(System.out::println);
    }
}
