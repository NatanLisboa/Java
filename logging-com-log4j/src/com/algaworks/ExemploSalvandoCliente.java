package com.algaworks;

import com.algaworks.dao.ClienteDAO;
import com.algaworks.model.Cliente;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExemploSalvandoCliente {

    private static final Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        logger.info("Iniciando a aplicação");

        Cliente cliente = new Cliente("João");
        ClienteDAO.salvar(cliente);

        ClienteDAO.salvar(null);

        logger.info("Finalizando a aplicação");

    }

}
