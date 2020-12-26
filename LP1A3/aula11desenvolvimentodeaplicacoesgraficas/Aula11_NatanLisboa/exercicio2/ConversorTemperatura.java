package Aula11_NatanLisboa.exercicio2;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ConversorTemperatura extends JFrame{
	
	private JLabel lbTemperatura;
	private JTextField tfTemperatura;
	private JLabel lbConversoes;
	private JRadioButton[] rbConversoes;
	private ButtonGroup bgConversoes;
	private Container cp;
	String temperatura;
	private static final String[] valConversoes = {"Celsius para Fahrenheit",
												   "Fahrenheit para Celsius",
												   "Celsius para Kelvin",
												   "Kelvin para Celsius",
												   "Fahrenheit para Kelvin",
												   "Kelvin para Fahrenheit"};
	
	public ConversorTemperatura() throws HeadlessException {
		
		lbTemperatura = new JLabel("Temperatura");
		tfTemperatura = new JTextField();
		lbConversoes = new JLabel();
		rbConversoes = new JRadioButton[6];
		bgConversoes = new ButtonGroup();
		temperatura = new String();
		
		setTitle("Exercício 2");
		setSize(300, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < rbConversoes.length; i++) {
			rbConversoes[i] = new JRadioButton(valConversoes[i]);
			rbConversoes[i].setBackground(new Color(233, 227, 206));
			rbConversoes[i].setToolTipText("Selecione esta opção para efetuar a operação descrita automaticamente");
			bgConversoes.add(rbConversoes[i]);
		}
	
		lbTemperatura.setBounds(50, 40, 100, 25);
		tfTemperatura.setBounds(140, 35, 100, 25);
		lbConversoes.setBorder(BorderFactory.createTitledBorder("Operações"));
		lbConversoes.setBounds(50, 80, 185, 180);
		for (int i = 0, y = 100; i < rbConversoes.length; i++, y += 25) {
			rbConversoes[i].setBounds(70, y, 160, 30);
		}
		rbConversoes[0].setSelected(true);
		
		cp = getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(233, 227, 206));
		cp.add(lbTemperatura);
		cp.add(tfTemperatura);
		cp.add(lbConversoes);
		for (int i = 0; i < rbConversoes.length; i++) {
			cp.add(rbConversoes[i]);
		}
		
		rbConversoes[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rbCelsiusFahrenheitConversion();
			}
			
			
		});

		rbConversoes[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rbFahrenheitCelsiusConversion();
			}
			
			
		});
		
		rbConversoes[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rbCelsiusKelvinConversion();
			}
			
			
		});		
		
		rbConversoes[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rbKelvinCelsiusConversion();
			}
			
			
		});
		
		rbConversoes[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rbFahrenheitKelvinConversion();
			}
			
			
		});
		
		rbConversoes[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rbKelvinFahrenheitConversion();
			}
			
			
		});
		
	}
	
	private void rbCelsiusFahrenheitConversion() {
		
		try {
			
			temperatura = tfTemperatura.getText();
			
			double temperaturaCelsius = Double.parseDouble(temperatura);
			double temperaturaFahrenheit;
			
			temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
			
			JOptionPane.showMessageDialog(this,
										  temperaturaCelsius + "ºC = " + temperaturaFahrenheit + "ºF",
										  "Resultado",
										  JOptionPane.INFORMATION_MESSAGE);
			
		} catch (IllegalArgumentException | InputMismatchException e){
			JOptionPane.showMessageDialog(this, 
					"A temperatura inserida é inválida. Por favor, insira uma temperatura válida e tente novamente",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void rbFahrenheitCelsiusConversion() {
		
		try {
			
			temperatura = tfTemperatura.getText();		
			
			double temperaturaFahrenheit = Double.parseDouble(temperatura);
			double temperaturaCelsius;
			
			temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
			
			JOptionPane.showMessageDialog(this,
										  temperaturaFahrenheit + "ºF = " + temperaturaCelsius + "ºC",
										  "Resultado",
										  JOptionPane.INFORMATION_MESSAGE);
			
		} catch (IllegalArgumentException | InputMismatchException e){
			JOptionPane.showMessageDialog(this, 
					"A temperatura inserida é inválida. Por favor, insira uma temperatura válida e tente novamente",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void rbCelsiusKelvinConversion() {
		
		try {
			
			temperatura = tfTemperatura.getText();		
			
			double temperaturaCelsius = Double.parseDouble(temperatura);
			double temperaturaKelvin;
			
			temperaturaKelvin = temperaturaCelsius + 273.15;
			
			JOptionPane.showMessageDialog(this,
										  temperaturaCelsius + "ºC = " + temperaturaKelvin + " K",
										  "Resultado",
										  JOptionPane.INFORMATION_MESSAGE);
			
		} catch (IllegalArgumentException | InputMismatchException e){
			JOptionPane.showMessageDialog(this, 
					"A temperatura inserida é inválida. Por favor, insira uma temperatura válida e tente novamente",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void rbKelvinCelsiusConversion() {
		
		try {
			
			temperatura = tfTemperatura.getText();		
			
			double temperaturaKelvin = Double.parseDouble(temperatura);
			double temperaturaCelsius;
			
			temperaturaCelsius = temperaturaKelvin - 273.15;
			
			JOptionPane.showMessageDialog(this,
										  temperaturaKelvin + " K = " + temperaturaCelsius + "ºC",
										  "Resultado",
										  JOptionPane.INFORMATION_MESSAGE);
			
		} catch (IllegalArgumentException | InputMismatchException e){
			JOptionPane.showMessageDialog(this, 
					"A temperatura inserida é inválida. Por favor, insira uma temperatura válida e tente novamente",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void rbFahrenheitKelvinConversion() {
		
		try {
			
			temperatura = tfTemperatura.getText();		
			
			double temperaturaFahrenheit = Double.parseDouble(temperatura);
			double temperaturaKelvin;
			
			temperaturaKelvin = (temperaturaFahrenheit + 459.67) / 1.8;
			
			JOptionPane.showMessageDialog(this,
										  temperaturaFahrenheit + "ºF = " + temperaturaKelvin + " K",
										  "Resultado",
										  JOptionPane.INFORMATION_MESSAGE);
			
		} catch (IllegalArgumentException | InputMismatchException e){
			JOptionPane.showMessageDialog(this, 
					"A temperatura inserida é inválida. Por favor, insira uma temperatura válida e tente novamente",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private void rbKelvinFahrenheitConversion() {
		
		try {
			
			temperatura = tfTemperatura.getText();		
			
			double temperaturaKelvin = Double.parseDouble(temperatura);
			double temperaturaFahrenheit;
			
			temperaturaFahrenheit = temperaturaKelvin * 1.8 - 459.67;
			
			JOptionPane.showMessageDialog(this,
										  temperaturaKelvin + " K = " + temperaturaFahrenheit + "ºF",
										  "Resultado",
										  JOptionPane.INFORMATION_MESSAGE);
			
		} catch (IllegalArgumentException | InputMismatchException e){
			JOptionPane.showMessageDialog(this, 
					"A temperatura inserida é inválida. Por favor, insira uma temperatura válida e tente novamente",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
