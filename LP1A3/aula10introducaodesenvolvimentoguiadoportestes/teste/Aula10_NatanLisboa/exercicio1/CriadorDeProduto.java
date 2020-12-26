package Aula10_NatanLisboa.exercicio1;

public class CriadorDeProduto {
	
	private Produto produto;
	
	public CriadorDeProduto() {
		
	}
	
	public CriadorDeProduto criarProduto() {
		produto = new Produto();
		return this;
	}
	
	public CriadorDeProduto criarProduto(String nome, double quantidade, double estoqueMinimo, double estoqueMaximo) {
		produto = new Produto(nome, quantidade, estoqueMinimo, estoqueMaximo);
		return this;
	}

	public Produto getProduto() {
		return produto;
	}
	
}
