package com.fonsecaworks.classes.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane3 {

	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); // Atribui a aparência de janelas padrão ao programa
		
		Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};
		
		int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, opcoes, opcoes[2]);
		
		System.out.println("Opção selecionada: " + opcaoSelecionada);
		
	}

}
