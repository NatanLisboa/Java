package com.algaworks;

import com.algaworks.modelo.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class MainComGenerics {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João"));
        funcionarios.add(new Funcionario("Maria"));

//        funcionarios.add("Ricardo");

        for (Funcionario f : funcionarios) { // Agora é possível fazer um foreach por já sabermos a tipagem da lista "funcionarios"
            System.out.println("Nome do funcionário: " + f.getNome());
        }
    }
}
