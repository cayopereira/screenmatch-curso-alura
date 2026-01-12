package br.com.alura.screenmatch.desafios.aula4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        System.out.println("6. Agrupando por categoria");
        Map<String, List<Produto>> categorias = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(categorias);

        System.out.println("\n7.Quantidade por categoria");
        Map<String, Long> contagemPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        System.out.println(contagemPorCategoria);

        System.out.println("\n8.Produto mais caro de cada categoria:");
        Map<String, Optional<Produto>> maisCaroPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
        System.out.println(maisCaroPorCategoria);

        System.out.println("\n9.Total dos preços dos produtos de cada categoria:");
        Map<String, Double> somaPrecoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));
        System.out.println(somaPrecoPorCategoria);
    }
}

