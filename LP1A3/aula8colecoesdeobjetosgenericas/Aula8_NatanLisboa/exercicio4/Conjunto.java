package Aula8_NatanLisboa.exercicio4;

import java.util.HashSet;

public class Conjunto {
	
	public HashSet<String> conjunto;

	public Conjunto(HashSet<String> conjunto) {
		this.conjunto = conjunto;
	}

	public HashSet<String> getConjunto() {
		return conjunto;
	}

	public void setConjunto(HashSet<String> conjunto) {
		this.conjunto = conjunto;
	}
	
	public void inserirProdutoNoConjunto(String nomeProduto) {
		conjunto.add(nomeProduto);
	}
	
	public boolean consultarProdutoDoConjuntoPeloNome(String nomeProduto) {
		
		return conjunto.contains(nomeProduto);
		
	}
	
	public void removerProdutoDoConjunto(String nomeProduto) {
		
		conjunto.remove(nomeProduto);
		
	}
	
}
