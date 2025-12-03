package br.com.alura.screenmatch.desafios.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NovaLista {

        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

            List<Integer> imparesMultiplicados = numeros.stream()
                    .filter(n -> n%2 == 1)
                    .map(n -> n*2)
                    .collect(Collectors.toList());

            imparesMultiplicados.forEach(System.out::println);
        }


    }

