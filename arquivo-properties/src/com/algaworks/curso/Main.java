package com.algaworks.curso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("./config/config.properties")); // Carrega arquivo .properties

        //Conectar no banco de dados
        String url = properties.getProperty("banco.dados.url");
        String usuario = properties.getProperty("banco.dados.usuario");
        String senha = properties.getProperty("banco.dados.senha");

        System.out.println("------------------------------------");
        System.out.println("Conectando ao banco de dados");
        System.out.println("------------------------------------");
        System.out.println("URL: " + url);
        System.out.println("Usuário: " + usuario);
        System.out.println("------------------------------------");

        try {
            int x = 5 / 0;
        } catch (Exception e) {
            //Caso ocorra algum erro, é necessário contatar o admin
            String email = properties.getProperty("email.admin");
            System.err.printf("Enviando email para: %s informando o erro: %s\n", email, e.getMessage());
        }

    }
}