package com.algaworks;

import com.algaworks.modelo.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List funcionarios = new ArrayList();

        funcionarios.add(new Funcionario("João"));
        funcionarios.add(new Funcionario("Maria"));

        funcionarios.add("Ricardo");

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = (Funcionario) funcionarios.get(i);

            System.out.println("Nome do funcionário: " + f.getNome());
        }
    }
}