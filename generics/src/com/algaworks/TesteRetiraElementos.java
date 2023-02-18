package com.algaworks;

import com.algaworks.modelo.Funcionario;
import com.algaworks.util.RetiraElementos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TesteRetiraElementos {
    public static void main(String[] args) {
        List<Funcionario> nomes = new ArrayList<>();
        nomes.add(new Funcionario("João"));
        nomes.add(new Funcionario("Maria"));

        Funcionario funcionario = RetiraElementos.recuperaPrimeiroElemento(nomes);
        if (Objects.nonNull(funcionario)) {
            System.out.println(funcionario.getNome());
        }
    }
}
