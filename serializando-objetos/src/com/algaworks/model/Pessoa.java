package com.algaworks.model;

import java.io.Serial;
import java.io.Serializable;

public class Pessoa implements Serializable { // Para um objeto de uma classe poder ser salvo em um arquivo (serializado) todos os atributos precisam ser de tipos que implementem a interface Serializable

    @Serial
    private static final long serialVersionUID = 2L;

    private String nome;
    private int idade;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
