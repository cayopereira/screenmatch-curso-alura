package br.com.alura.screenmatch.desafios.aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> numerosSeparados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));

        System.out.println("Pares: " + numerosSeparados.get(true));
        System.out.println("Ímpares: " + numerosSeparados.get(false));

    }
}

