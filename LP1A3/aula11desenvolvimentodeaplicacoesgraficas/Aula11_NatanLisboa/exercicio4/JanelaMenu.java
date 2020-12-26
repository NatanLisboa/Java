package Aula11_NatanLisboa.exercicio4;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class JanelaMenu extends JFrame{
	
	private JMenuBar mbBarra;
	private JMenu mnCadastro;
	private JMenu mnCadClientes;
	private JMenuItem[] miCadClientes;
	private static final String[] cadCliItens = {"Pessoa Física", "Pessoa Jurídica"};
	private JMenuItem miFornecedores;
	private JMenuItem miSair;
	
	public JanelaMenu() throws HeadlessException {
		
		mbBarra = new JMenuBar();
		mnCadastro = new JMenu("Cadastro");
		mnCadClientes = new JMenu("Clientes");
		miCadClientes = new JMenuItem[2];
		miFornecedores = new JMenuItem("Fornecedores");
		miSair = new JMenuItem("Sair");
		
		setTitle("Exercício 4");
		setSize(300, 300);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(245, 245, 220));
		mnCadClientes.setMnemonic('C');
		miFornecedores.setMnemonic('F');
		miSair.setMnemonic('S');
		for (int i = 0; i < miCadClientes.length; i++) {
			miCadClientes[i] = new JMenuItem(cadCliItens[i]);
			mnCadClientes.add(miCadClientes[i]);
		}
		mnCadastro.add(mnCadClientes);
		mnCadastro.add(miFornecedores);
		mnCadastro.addSeparator();
		mnCadastro.add(miSair);
		mbBarra.add(mnCadastro);
		setJMenuBar(mbBarra);
		
		miCadClientes[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miCadClientes0Action();
			}
			
		});
		
		miCadClientes[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miCadClientes1Action();
			}
			
		});
		
		miFornecedores.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miFornecedoresAction();
			}
			
			
		});
		
		miSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miSairAction();
			}
			
		});
		
	}
	
	private void miCadClientes0Action() {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JanelaPessoaFisica().setVisible(true); 
			}
		});
		
	}
	
	private void miCadClientes1Action() {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JanelaPessoaJuridica().setVisible(true); 
			}
		});
		
	}
	
	private void miFornecedoresAction() {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JanelaFornecedores().setVisible(true); 
			}
		});
		
	}
	
	private void miSairAction() {
		
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		
	}
}
