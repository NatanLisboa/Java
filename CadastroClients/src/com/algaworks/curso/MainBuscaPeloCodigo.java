package com.algaworks.curso;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class MainBuscaPeloCodigo {

	public static void main(String[] args) {
		System.out.println();
		
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		try {

			Cliente cliente = clienteDAO.buscarPeloCodigo(1L);

			if (cliente != null) {
				System.out.println("------- Cliente encontrado ---------");
				System.out.printf("Código: %d\n", cliente.getCodigo());
				System.out.printf("Nome: %s\n", cliente.getNome());
				System.out.println();
			} else {
				System.out.println("Nenhum cliente foi encontrado com o código especificado");
			}

		} catch (DAOException e) {
			throw new RuntimeException("Erro ao buscar cliente pelo código: " + e);
		}


	}

}
