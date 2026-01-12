package br.com.alura.screenmatch.desafios.aula3;

import java.util.Arrays;
import java.util.List;

public class RemovendoDuplicatas {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        palavras.stream().distinct().forEach(System.out::println);
    }
}
