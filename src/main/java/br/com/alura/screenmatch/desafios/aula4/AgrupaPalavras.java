package br.com.alura.screenmatch.desafios.aula4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupaPalavras {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> grupo = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grupo);



        // código do agrupamento

        // Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
    }
}
