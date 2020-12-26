package Aula11_NatanLisboa.exercicio4;

import javax.swing.JDialog;

@SuppressWarnings("serial")
public class JanelaFornecedores extends JDialog {
	
	public JanelaFornecedores() {
		getContentPane();
		setTitle("Fornecedores");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setModal(true);
	}
	
}
