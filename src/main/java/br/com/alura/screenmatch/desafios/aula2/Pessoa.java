package br.com.alura.screenmatch.desafios.aula2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19),
                new Pessoa ("Arrascaeta", 31)
        );

        List<Pessoa> maioresDeIdade = pessoas.stream()
                .filter(p -> p.idade >= 18)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList());

        maioresDeIdade.forEach(m -> System.out.println(m.getNome()));

    }
}
