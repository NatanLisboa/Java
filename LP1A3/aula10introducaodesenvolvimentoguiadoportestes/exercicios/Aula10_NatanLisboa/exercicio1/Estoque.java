package Aula10_NatanLisboa.exercicio1;

import java.util.List;

public class Estoque {
	
	private String loja;
	private List<Produto> produtos;
	
	public Estoque() {
		
	}

	public Estoque(String loja, List<Produto> produtos) {
		this.loja = loja;
		this.produtos = produtos;
	}

	public void estoque(String loja) {
		
		if (this.loja.equals(loja)){
			System.out.println("Estoque da loja " + loja + ":");
			for (Produto p : this.produtos) {
				System.out.println(p);
			}
		} else {
			System.out.println("A loja " + loja + " não foi encontrada!");
		}
		
	}
	
	public void armazena(Produto produto) {
		this.produtos.add(produto);
	}
	
	public String getLoja() {
		return loja;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
