package com.algaworks.curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            Usuario usuario = new Usuario(nome, idade);
            System.out.println("Obrigado " + usuario.getNome() + " por se cadastrar");

        }
    }
}