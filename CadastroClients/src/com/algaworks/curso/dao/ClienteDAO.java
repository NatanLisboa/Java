package com.algaworks.curso.dao;

import com.algaworks.curso.modelo.Cliente;

import java.util.List;

public interface ClienteDAO {

	void salvar(Cliente cliente) throws DAOException;
	
	Cliente buscarPeloCodigo(long codigo) throws DAOException;

	List<Cliente> buscarTodos() throws DAOException;

}
