package Aula11_NatanLisboa.exercicio3;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Sedex extends JFrame{
	
	private JLabel lbValorProdutoInsercao, lbValorProdutoResultado, lbValorProdutoResultadoCalculado, lbValorFrete, lbValorFreteCalculado, lbValorTotal, lbValorTotalCalculado, lbEstado, lbTipoPostagem;
	private JTextField tfValorProduto;
	private JCheckBox ckFidelidade;
	private JComboBox<String> cbEstado; 
	private static final String[] valEstado = {"SP", "RJ", "MG", "ES"};
	private JRadioButton[] rbTiposPostagem;
	private static final String[] valTipoPostagem = {"Sedex", "Sedex 10"};
	private ButtonGroup bgTiposPostagem;
	private JButton btCalcular;
	private Container cp;
	private int insercoesComExitoSeguidas = 0;
	
	public Sedex() throws HeadlessException {
		
		lbValorProdutoInsercao = new JLabel("Valor do Produto");
		lbValorProdutoResultado = new JLabel("Valor do Produto:");
		lbValorFrete = new JLabel("Valor do Frete:");
		lbValorTotal = new JLabel("Valor Total:");
		lbEstado = new JLabel("Estado");
		lbTipoPostagem = new JLabel();
		tfValorProduto = new JTextField();
		ckFidelidade = new JCheckBox("Cliente com fidelidade");
		cbEstado = new JComboBox<>(valEstado);
		rbTiposPostagem = new JRadioButton[2];
		bgTiposPostagem = new ButtonGroup();
		btCalcular = new JButton("Calcular");
		
		setTitle("Exercício 3");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbValorProdutoInsercao.setBounds(40, 30, 100, 25);
		tfValorProduto.setBounds(150, 30, 100, 25);
		lbValorProdutoResultado.setBounds(270, 30, 100, 25);
		lbValorFrete.setBounds(270, 60, 100, 25);
		lbValorTotal.setBounds(270, 90, 100, 25);
		ckFidelidade.setBounds(40, 60, 150, 25);
		ckFidelidade.setToolTipText("Clientes com fidelidade ganham 10% de desconto no valor do produto");
		lbEstado.setBounds(40, 95, 100, 25);
		cbEstado.setBounds(90, 95, 50, 25);
		lbTipoPostagem.setBorder(BorderFactory.createTitledBorder("Tipo de Postagem"));
		lbTipoPostagem.setBounds(40, 130, 200, 65);
		for (int i = 0, y = 145; i < rbTiposPostagem.length; i++, y+=20) {
			rbTiposPostagem[i] = new JRadioButton(valTipoPostagem[i]);
			rbTiposPostagem[i].setBounds(50, y, 100, 25);
			bgTiposPostagem.add(rbTiposPostagem[i]);
		}
		rbTiposPostagem[0].setSelected(true);
		btCalcular.setBounds(100, 210, 100, 25);
		
		cp = getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(233, 227, 206));
		cp.add(lbValorProdutoInsercao);
		cp.add(tfValorProduto);
		cp.add(lbValorProdutoResultado);
		cp.add(lbValorFrete);
		cp.add(lbValorTotal);
		cp.add(ckFidelidade);
		cp.add(lbEstado);
		cp.add(cbEstado);
		cp.add(lbTipoPostagem);
		cp.add(rbTiposPostagem[0]);
		cp.add(rbTiposPostagem[1]);
		cp.add(btCalcular);
		
		btCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btCalculeProductTotalValue();
			}
			
		});
	}
	
	private void btCalculeProductTotalValue() {
		
		try {
			
			String valorProdutoInserido = new String();
			String valorFreteLabel = new String();
			String valorTotalLabel = new String();
			String estadoSelecionado = new String();
			double valorProduto;
			double valorFrete = 0.0f;
			double valorTotal = 0.0f;
			
			insercoesComExitoSeguidas++;
			
			if (insercoesComExitoSeguidas > 1) {
				cp.remove(lbValorProdutoResultadoCalculado);
				cp.remove(lbValorFreteCalculado);
				cp.remove(lbValorTotalCalculado);
			}
			
			valorProdutoInserido = tfValorProduto.getText();
			valorProduto = Double.parseDouble(valorProdutoInserido);
			
			if (ckFidelidade.isSelected()) {
				valorProduto = 0.9 * valorProduto;
				valorProdutoInserido = Double.toString(valorProduto);
			}
			
			if (valorProdutoInserido.contains(".")) {
				if (valorProdutoInserido.length() == valorProdutoInserido.indexOf('.') + 1) {
					valorProdutoInserido = "R$" + valorProdutoInserido.replace('.', ',') + "00";
				} else if (valorProdutoInserido.length() == valorProdutoInserido.indexOf('.') + 2) {
					valorProdutoInserido = "R$" + valorProdutoInserido.replace("." + valorProdutoInserido.substring(valorProdutoInserido.indexOf(".") + 1, valorProdutoInserido.length()), "," + valorProdutoInserido.substring(valorProdutoInserido.indexOf(".") + 1) + "0");
				} else if (valorProdutoInserido.length() == valorProdutoInserido.indexOf(".") + 3) {
					valorProdutoInserido = "R$" + valorProdutoInserido.replace(".", ",");
				} else {
					valorProdutoInserido = "ERROR";
					valorProduto = Double.parseDouble(valorProdutoInserido);
				}
			} else {
				valorProdutoInserido = "R$" + valorProdutoInserido + ",00";
			}
			
			estadoSelecionado = (String) cbEstado.getSelectedItem();
			
			switch(estadoSelecionado) {
				case "SP":
					valorFrete = 0.1 * valorProduto;
					break;
				case "RJ":
				case "MG":
					valorFrete = 0.15 * valorProduto;
					break;
				case "ES":
					valorFrete = 0.2 * valorProduto;
			}
			
			if (rbTiposPostagem[1].isSelected()) {
				valorFrete += 0.2 * valorFrete;
			}
			
			valorTotal = valorProduto + valorFrete;
			
			valorFreteLabel = "R$" + Double.toString(valorFrete).replace('.', ',');
			
			if (valorFreteLabel.length() == valorFreteLabel.indexOf(',') + 2) {
				valorFreteLabel += "0";
			}
			
			valorTotalLabel = "R$" + Double.toString(valorTotal).replace('.', ',');
			
			if (valorTotalLabel.length() == valorTotalLabel.indexOf(',') + 2) {
				valorTotalLabel += "0";
			}
			
			lbValorProdutoResultadoCalculado = new JLabel(valorProdutoInserido);
			lbValorFreteCalculado = new JLabel(valorFreteLabel);
			lbValorTotalCalculado = new JLabel(valorTotalLabel);
			lbValorProdutoResultadoCalculado.setBounds(380, 30, 70, 25);
			lbValorFreteCalculado.setBounds(380, 60, 70, 25);
			lbValorTotalCalculado.setBounds(380, 90, 70, 25);
			cp.add("{:.2f}", lbValorProdutoResultadoCalculado);
			cp.add("{:.2f}", lbValorFreteCalculado);
			cp.add("{:.2f}", lbValorTotalCalculado);
			
		} catch (IllegalArgumentException | InputMismatchException e) {
			
			insercoesComExitoSeguidas = 0;
			
			JOptionPane.showMessageDialog(this,
					                      "Valor inválido inserido! Por favor, insira um valor válido para o produto e tente novamente"
					                      + " (Não é necessário incluir \"R$\")",
					                      "Erro",
					                      JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}

