package com.algaworks;

import com.algaworks.model.Pessoa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {

    public static void main(String[] args) {
        try (ObjectInput input = new ObjectInputStream(new FileInputStream("natan.obj"))){
            Pessoa p = (Pessoa) input.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissão: " + p.getProfissao());
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao converter para a classe " + Pessoa.class + ": " + e.getMessage());
        }
    }
}
