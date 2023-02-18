package com.algaworks.modelo;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> {

    private List<E> colecao = new ArrayList<>();

    public void colocar(E e) {
        colecao.add(e);
    }

    public E retirarPrimeiroElemento() {
        if (!colecao.isEmpty()) {
            return colecao.get(0);
        }
        return null;
    }

}
