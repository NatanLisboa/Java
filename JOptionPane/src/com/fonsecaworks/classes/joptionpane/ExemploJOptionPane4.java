package com.fonsecaworks.classes.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane4 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Object[] possibilidades = {"Masculino", "Feminino"};
	
		String sexoSelecionado = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);
		
		System.out.println("Sexo selecionado: " + sexoSelecionado);
		
		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null, null, null); // Quando é passado null como argumento para os últimos dois parâmetros, essa caixa de diálogo será de um input comum.
		
		System.out.println("Nome: " + nome);
		
	}

}
