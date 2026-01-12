package br.com.alura.screenmatch.desafios.aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> somaQuadrados = numeros.stream()
                .map(n -> n*n).reduce(Integer::sum);


        System.out.println(somaQuadrados.get());


    }
}

