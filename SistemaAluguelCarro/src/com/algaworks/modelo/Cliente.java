package com.algaworks.modelo;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private LocalDate dataNascimento; // LocalDate: JDK 8+ (Só possui YYYY-MM-DD, sem a hora)

    public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
