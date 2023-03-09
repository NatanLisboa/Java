package com.algaworks;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {
    private static final Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

    public static void main(String[] args) {
        BasicConfigurator.configure(); // Forma mais básica de configuração do Log4J, logando no console. Geralmente não é utilizado em prod

        logger.info("Começando a aplicação");
        // Código da aplicação
        logger.info("Finalizando a aplicação");
    }
}