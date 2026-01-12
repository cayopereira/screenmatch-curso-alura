package br.com.alura.screenmatch.desafios.aula3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LetrasMaiusculas {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        List<String> palavrasMaiusculas = palavras.stream()
                .map(p -> p.toUpperCase())
                .collect(Collectors.toList());

        palavrasMaiusculas.forEach(System.out::println);

    }
}
