package Aula11_NatanLisboa.exercicio1;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Calculadora().setVisible(true); 
			}
		});
		
	}

}
