package com.algaworks.dao;

import com.algaworks.model.Cliente;
import org.apache.log4j.Logger;

import java.util.Objects;

public class ClienteDAO {

    private static final Logger logger = Logger.getLogger(ClienteDAO.class);

    public static void salvar(Cliente cliente) {
        if (Objects.isNull(cliente)) {
            logger.warn("O cliente está nulo");
        }
        if (logger.isDebugEnabled()) {
            logger.debug("Salvando o cliente: " + cliente);
            logger.debug("Cliente salvo com sucesso.");
        }
    }


}
