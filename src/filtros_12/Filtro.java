package filtros_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 7, 2, 3, 4, 22);
        List<Integer> numerosFilltrados = numeros.stream().filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(numerosFilltrados);
    }
}
