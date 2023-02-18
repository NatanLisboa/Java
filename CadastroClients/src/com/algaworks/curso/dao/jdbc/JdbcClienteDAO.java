package com.algaworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private final Connection connection;
	
	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) throws DAOException {
		try {
			String statement = String.format("insert into cliente(nome) values ('%s')", cliente.getNome());
			
			PreparedStatement preparedStatement = this.connection.prepareStatement(statement);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente: ", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {}
		}
	}

	@Override
	public Cliente buscarPeloCodigo(long codigo) throws DAOException {
		
		Cliente cliente = null;
		
		try {
			String statement = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement preparedStatement = this.connection.prepareStatement(statement);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente: ", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {}
		}
		
		return cliente;
		
	}

	@Override
	public List<Cliente> buscarTodos() throws DAOException {
		try {
			List<Cliente> clientes = new ArrayList<>();
			String statement = "select * from cliente";
			PreparedStatement preparedStatement = this.connection.prepareStatement(statement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				clientes.add(cliente);
			}

			return clientes;
			
		} catch (SQLException e) {
			throw new DAOException("Erro ao buscar clientes: ", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
				System.out.println("Erro ao fechar conexão com o banco de dados");
			}
		}
	}


}
