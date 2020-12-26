package Aula8_NatanLisboa.exercicio2;

import java.util.LinkedList;

public class Fila {
	
	private LinkedList<String> fila;

	public Fila(LinkedList<String> fila) {
		this.fila = fila;
	}

	public LinkedList<String> getFila() {
		return fila;
	}

	public void setFila(LinkedList<String> fila) {
		this.fila = fila;
	}
	
	public void inserirPessoaNaFila(String nomePessoa) {
		fila.add(nomePessoa);
	}
	
	public void removerPessoaDaFila() {
		fila.pollFirst();
	}
	
	
}
