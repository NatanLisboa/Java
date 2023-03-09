package com.algaworks.curso;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.isBlank;

public class Usuario {

    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        if ((isNull(nome) || isBlank(nome) || idade < 0)){
            throw new IllegalArgumentException("Valores inválidos informados! Reinicie o programa e tente novamente.");
        } else {
            this.nome = nome.trim();
            this.idade = idade;
        }
    }

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
}
