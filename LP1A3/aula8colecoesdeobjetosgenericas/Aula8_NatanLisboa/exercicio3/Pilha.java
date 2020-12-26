package Aula8_NatanLisboa.exercicio3;

import java.util.LinkedList;

public class Pilha {
	
	private LinkedList<String> pilha;

	public Pilha(LinkedList<String> pilha) {
		this.pilha = pilha;
	}

	public LinkedList<String> getPilha() {
		return pilha;
	}

	public void setPilha(LinkedList<String> pilha) {
		this.pilha = pilha;
	}
	
	public void inserirLivroNaPilha(String tituloLivro) {
		pilha.add(tituloLivro);
	}
	
	public void removerLivroDaPilha() {
		pilha.pollLast();
	}

}