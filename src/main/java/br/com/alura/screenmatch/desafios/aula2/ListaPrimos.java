package br.com.alura.screenmatch.desafios.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaPrimos {

    private static Boolean eNumeroPrimo(int numero){
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> primos = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(ListaPrimos::eNumeroPrimo)
                .collect(Collectors.toList());

        primos.forEach(System.out::println);
    }
}
