package br.com.alura.screenmatch.desafios.aula3;

import java.util.Arrays;
import java.util.List;

public class FiltraNumerosPares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();

        numerosPares.forEach(System.out::println);


        }
    }


