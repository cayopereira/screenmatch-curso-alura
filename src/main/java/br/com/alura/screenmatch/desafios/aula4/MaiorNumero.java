package br.com.alura.screenmatch.desafios.aula4;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numeros.stream().max(Integer::compare);

        max.ifPresent(System.out::println);

    }
}

