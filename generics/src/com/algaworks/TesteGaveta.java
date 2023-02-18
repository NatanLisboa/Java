package com.algaworks;

import com.algaworks.modelo.Gaveta;

public class TesteGaveta {

    public static void main(String[] args) {
        Gaveta<String> gavetaStrings = new Gaveta<>();

        gavetaStrings.colocar("Livro de Java");

        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(4);

        System.out.println(gavetaStrings.retirarPrimeiroElemento());
        System.out.println(gavetaNumeros.retirarPrimeiroElemento());
    }
}
