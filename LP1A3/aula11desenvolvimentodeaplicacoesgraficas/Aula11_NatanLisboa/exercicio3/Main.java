package Aula11_NatanLisboa.exercicio3;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Sedex().setVisible(true); 
			}
		});
		
	}

}
