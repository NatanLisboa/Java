package com.algaworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private final Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente", "root", "A1b2c3d4e5#.");
		} catch(Exception e) {
			throw new RuntimeException("Erro ao estabelecer conexão com o banco de dados: " + e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
	
}
