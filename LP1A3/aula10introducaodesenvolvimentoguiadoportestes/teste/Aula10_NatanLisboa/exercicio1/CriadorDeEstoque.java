package Aula10_NatanLisboa.exercicio1;

import java.util.List;

public class CriadorDeEstoque {
	
	private Estoque estoque;
	
	public CriadorDeEstoque() {
		
	}
	
	public CriadorDeEstoque criarEstoque() {
		estoque = new Estoque();
		return this;
	}
	
	public CriadorDeEstoque criarEstoque(String loja, List<Produto> produtos) {
		estoque = new Estoque(loja, produtos);
		return this;
	}

	public Estoque getEstoque() {
		return estoque;
	}
	
}
