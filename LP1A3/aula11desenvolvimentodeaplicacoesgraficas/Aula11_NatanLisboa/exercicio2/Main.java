package Aula11_NatanLisboa.exercicio2;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ConversorTemperatura().setVisible(true); 
			}
		});

	}

}
