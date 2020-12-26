package Aula5_NatanLisboa.exercicio2;

public class Computador {
	
	private String modelo;
	private String teclado;
	private String mouse;
	private String monitor;
	private String gabinete;
	private int ram;
	private Processador processador;
	
	public Computador() {
		this.processador = new Processador();
	}

	public void getDadosComputador() {
		
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Teclado: " + this.teclado);
		System.out.println("Mouse: " + this.mouse);
		System.out.println("Monitor: " + this.monitor);
		System.out.println("Gabinete: " + this.gabinete);
		System.out.println("Quantidade de RAM: " + this.ram + "GB");
		System.out.println("Dados do processador: \n" + this.processador.getDadosProcessador());
		
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setGabinete(String gabinete) {
		this.gabinete = gabinete;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setProcessador(String modelo, double frequencia, int nucleos, double cache, int potencia) {
		
		this.processador.setModelo(modelo);
		this.processador.setFrequencia(frequencia);
		this.processador.setNucleos(nucleos);
		this.processador.setCache(cache);
		this.processador.setPotencia(potencia);
		
	}

	
	
	
	
}	
