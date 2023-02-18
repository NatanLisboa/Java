package com.fonsecaworks.classes.joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
		
		//Programa - Mensagem no box - Título da janela - Tipo da mensagem
		JOptionPane.showMessageDialog(null, "Atenção - E-mail não informado", "Atenção", JOptionPane.WARNING_MESSAGE); //Mensagem de atenção
		
		JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro", JOptionPane.ERROR_MESSAGE); //Mensagem de erro 
		
		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE); //Mensagem sem nenhum ícone/plana
		
		// Mensagem com ícone customizado
		URL url = ExemploJOptionPane2.class.getResource("/algaworks.png");
		Icon icone = new ImageIcon(url);
		
		JOptionPane.showMessageDialog(null, "Obrigado por escolher a Algaworks", "Algaworks", JOptionPane.INFORMATION_MESSAGE, icone); //Programa - Mensagem no box - Título da janela - Tipo da mensagem - Ícone
		
		
	}

}
