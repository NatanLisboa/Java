package com.algaworks.curso;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class Main {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Erro ao gerar interface de usuário Java: " + e);
		}	
		
		Cliente cliente = new Cliente();
		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Fonsecaworks - Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);
		
		cliente.setNome(nome);
		
		ClienteDAO clienteDAO = DAOFactory.getDaoFactory().getClienteDAO();
		try {
			if (nome != null) {
				clienteDAO.salvar(cliente);
				System.out.println("Cliente salvo com sucesso!");
			} else {
				System.out.println("Erro ao salvar cliente: O nome do cliente não pode ser nulo");
			}
		} catch (DAOException e) {
			System.out.println("Erro ao salvar cliente " + cliente.getNome() + ": " + e);
		}
	}

}
