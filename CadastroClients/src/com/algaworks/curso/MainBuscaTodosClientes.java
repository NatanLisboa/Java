package com.algaworks.curso;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

import java.util.List;

public class MainBuscaTodosClientes {

    public static void main(String[] args) {

        ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();

        List<Cliente> clientes;
        try {
            clientes = clienteDAO.buscarTodos();
        } catch (DAOException e) {
            throw new RuntimeException(e);
        }

        for (Cliente cliente : clientes) {
            System.out.println("------------------------------------");
            System.out.println("Cliente #" + cliente.getCodigo());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("------------------------------------");
            System.out.println();
        }

    }
}
