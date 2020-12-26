package Aula5_NatanLisboa.exercicio2;

public class Processador {
	
	private String modelo;
	private double frequencia;
	private int nucleos;
	private double cache;
	private int potencia;
	
	public Processador() {
		
	}

	public Processador(String modelo, double frequencia, int nucleos, float cache, int potencia) {
		this.modelo = modelo;
		this.frequencia = frequencia;
		this.nucleos = nucleos;
		this.cache = cache;
		this.potencia = potencia;
	}

	public String getDadosProcessador() {
		return "  Modelo: " + this.modelo + "\n" + 
				"  Frequ�ncia: " + this.frequencia + " GHz" + "\n" +
				"  N�cleos: " + this.nucleos + "\n" +
				"  Cache: " + this.cache + " MB" + "\n" +
				"  Pot�ncia: " + this.potencia + " W";
	}

	public void setCache(double cache) {
		this.cache = cache;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
}
