package Aula11_NatanLisboa.exercicio1;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	private JLabel lbValor1, lbValor2, lbOperacao;
	private JTextField tfValor1, tfValor2;
	private JComboBox<Character> cbOperacao;
	private JButton btCalcular;
	private Container cp;
	private static final Character[] valOperacao = {'+', '-', '*', '/', '%'};
	
	public Calculadora() throws HeadlessException { // HeadlessException: Exceção que é lançada quando um programa é dependente de teclado, tela ou mouse e o ambiente de execução do mesmo não tem o suporte ao dispositivo requisitado  
		
		lbValor1 = new JLabel("Valor 1");
		lbValor2 = new JLabel("Valor 2");
		tfValor1 = new JTextField();
		tfValor2 = new JTextField();
		lbOperacao = new JLabel("Operação");
		cbOperacao = new JComboBox<>(valOperacao);
		btCalcular = new JButton("Calcular");
		
		setTitle("Exercício 1");
		setSize(400, 210);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cbOperacao.setBackground(new Color(180, 205, 205));
		btCalcular.setToolTipText("Faz o cálculo");
		cp = getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(180, 205, 205));
		
		lbValor1.setBounds(40, 20, 100, 25);
		tfValor1.setBounds(100, 20, 100, 25);
		lbValor2.setBounds(40, 70, 100, 25);
		tfValor2.setBounds(100, 70, 100, 25);
		lbOperacao.setBounds(40, 120, 100, 25);
		cbOperacao.setBounds(100, 120, 50, 25);
		btCalcular.setBounds(250, 120, 100, 25);
		
		cp.add(lbValor1);
		cp.add(tfValor1);
		cp.add(lbValor2);
		cp.add(tfValor2);
		cp.add(lbOperacao);
		cp.add(cbOperacao);
		cp.add(btCalcular);
		
		btCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btCalculeAction();
			}
			
		});
		
	}
	
	private void btCalculeAction() {
		
		double valor1 = 0.0f;
		double valor2 = 0.0f;
		double resultado = 0.0f;
		
		try {
			
			valor1 = Double.parseDouble(tfValor1.getText());
			valor2 = Double.parseDouble(tfValor2.getText());
			
			if (cbOperacao.getSelectedItem().equals('+')) {
				resultado = valor1 + valor2;
				if (valor2 >= 0.0) {
					JOptionPane.showMessageDialog(this,
							valor1 + " + " + valor2 + " = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this,
							valor1 + " + (" + valor2 + ") = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else if (cbOperacao.getSelectedItem().equals('-')) {
				resultado = valor1 - valor2;
				if (valor2 >= 0.0) {
					JOptionPane.showMessageDialog(this,
							valor1 + " - " + valor2 + " = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this,
							valor1 + " - (" + valor2 + ") = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else if (cbOperacao.getSelectedItem().equals('*')) {
				resultado = valor1 * valor2;
				if (valor2 >= 0.0) {
					JOptionPane.showMessageDialog(this,
							valor1 + " * " + valor2 + " = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this,
							valor1 + " * (" + valor2 + ") = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else if (cbOperacao.getSelectedItem().equals('/')) {
				resultado = valor1 / valor2;
				if (valor2 >= 0.0) {
					JOptionPane.showMessageDialog(this,
							valor1 + " / " + valor2 + " = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this,
							valor1 + " / (" + valor2 + ") = " + resultado,
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				
				resultado = valor1 % valor2;
				
				String valor1String = tfValor1.getText();
				String valor2String = tfValor2.getText();
				String resultadoString = Double.toString(resultado);
				
				if (!(valor1String.contains(",") || valor1String.contains(".") || valor2String.contains(",") || valor2String.contains("."))) {
					
					int valor1Inteiro = Integer.parseInt(valor1String);
					int valor2Inteiro = Integer.parseInt(valor2String);
					int resultadoInteiro;
					
					if (resultadoString.length() > 1) {
						resultadoInteiro = Integer.parseInt(resultadoString.substring(0, 1));
					} else {
						resultadoInteiro = Integer.parseInt(resultadoString);
					}
					
					if (valor2Inteiro >= 0) {
						JOptionPane.showMessageDialog(this,
								valor1Inteiro + " % " + valor2Inteiro + " = " + resultadoInteiro,
								"Resultado",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,
								valor1Inteiro + " % (" + valor2Inteiro + ") = " + resultadoInteiro,
								"Resultado",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,
							"A operação de resto da divisão só aceita números inteiros."
							+ " Por favor, insira números inteiros e tente novamente",
							"Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
			
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(this,
					"Um dos valores digitados é inválido. Por favor, digite"
					+ " valores numéricos válidos e tente novamente.",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
