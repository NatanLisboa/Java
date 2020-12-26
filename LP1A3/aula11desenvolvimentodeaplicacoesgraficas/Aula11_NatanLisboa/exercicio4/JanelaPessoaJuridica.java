package Aula11_NatanLisboa.exercicio4;

import javax.swing.JDialog;

@SuppressWarnings("serial")
public class JanelaPessoaJuridica extends JDialog {
	
	public JanelaPessoaJuridica() {
		getContentPane();
		setTitle("Clientes - Pessoa Jurídica");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setModal(true);
	}
	
}
