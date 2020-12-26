package Aula8_NatanLisboa.exercicio1;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<String> lista;
	
	public Lista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public void inserirProduto(String nomeProduto) {
		
		lista.add(nomeProduto);
		
	}
	
	public void inserirProdutoEmPosicaoEspecifica(String nomeProduto, int posicaoInsercao) {
		
		lista.add(posicaoInsercao, nomeProduto);
		
	}
	
	public int consultarProdutoPeloNome(String nomeProduto) {
		
		return lista.indexOf(nomeProduto);
		
	}
	
	public String consultarProdutoPelaPosicao(int posicaoProduto) {
		
		return lista.get(posicaoProduto);
		
	}
	
	public void substituirProduto(int posicaoElemento, String novoProduto) {
		
		lista.set(posicaoElemento, novoProduto);
		
	}
	
	public void removerProdutoPeloNome(String nomeProduto) {
		
		lista.remove(nomeProduto);
		
	}
	
	public void removerProdutoPelaPosicao (int posicaoProduto) {
		
		lista.remove(posicaoProduto);
		
	}

}

