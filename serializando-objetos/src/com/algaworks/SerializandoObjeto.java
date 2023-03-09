package com.algaworks;

import com.algaworks.model.Pessoa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João Silva");
        p.setIdade(25);
        p.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("natan.obj"))) { // Linha para salvar objeto em arquivo
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso dentro do arquivo!");
        } catch (IOException e) {
            System.err.println("Erro salvando o objeto: " + e.getMessage());
        }
    }
}