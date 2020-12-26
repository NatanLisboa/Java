package Aula10_NatanLisboa.exercicio1;

import java.util.List;

public class CriadorDeControle {
	
	private Controle controle;
	
	public CriadorDeControle() {
		
	}
	
	public CriadorDeControle criarControle() {
		controle = new Controle();
		return this;
	}
	
	public CriadorDeControle criarControle(List<Produto> produtosComEstoqueInsuficiente, List<Produto> produtosComEstoqueExcedente, List<Produto> produtosComEstoqueZerado, List<Produto> produtosComEstoqueAdequado) {
		controle = new Controle(produtosComEstoqueInsuficiente, produtosComEstoqueExcedente, produtosComEstoqueZerado, produtosComEstoqueAdequado);
		return this;
	}

	public Controle getControle() {
		return controle;
	}
	
}
