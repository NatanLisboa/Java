package com.algaworks.curso;

import com.algaworks.curso.modelo.Cliente;
import com.algaworks.curso.modelo.Endereco;
import com.algaworks.curso.modelo.Telefone;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Aguas, 10", "Ribeirão Preto", "SP");
        Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-1111");
        Telefone comercial = new Telefone("COMERCIAL", "11 3222-2222");
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(residencial);
        telefones.add(comercial);

        Cliente cliente = new Cliente("João Silva", 28, endereco, telefones);

        Gson gson = new Gson();
        String json = gson.toJson(cliente); // Biblioteca gson: JSON to String

        System.out.println(json);

        Cliente c2 = gson.fromJson(json, Cliente.class); // Biblioteca gson: JSON string to object
        System.out.println(c2.getNome());
        System.out.println(c2.getIdade());
        System.out.println(c2.getEndereco().getRua() + " - " + c2.getEndereco().getCidade() + " (" + c2.getEndereco().getEstado() + ")");
        System.out.println(c2.getTelefones().get(0).getNumero());

    }
}