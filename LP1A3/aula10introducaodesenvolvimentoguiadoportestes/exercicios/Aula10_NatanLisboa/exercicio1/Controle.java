package Aula10_NatanLisboa.exercicio1;

import java.util.List;

public class Controle {
	
	private List<Produto> produtosComEstoqueInsuficiente;
	private List<Produto> produtosComEstoqueExcedente;
	private List<Produto> produtosComEstoqueZerado;
	private List<Produto> produtosComEstoqueAdequado;
	
	public Controle() {
		
	}
	
	public Controle(List<Produto> produtosComEstoqueInsuficiente, List<Produto> produtosComEstoqueExcedente,
			List<Produto> produtosComEstoqueZerado, List<Produto> produtosComEstoqueAdequado) {
		this.produtosComEstoqueInsuficiente = produtosComEstoqueInsuficiente;
		this.produtosComEstoqueExcedente = produtosComEstoqueExcedente;
		this.produtosComEstoqueZerado = produtosComEstoqueZerado;
		this.produtosComEstoqueAdequado = produtosComEstoqueAdequado;
	}

	public void controlaEstoques(Estoque estoque) {
		
	}

	public List<Produto> getProdutosComEstoqueInsuficiente() {
		return produtosComEstoqueInsuficiente;
	}

	public List<Produto> getProdutosComEstoqueExcedente() {
		return produtosComEstoqueExcedente;
	}

	public List<Produto> getProdutosComEstoqueZerado() {
		return produtosComEstoqueZerado;
	}

	public List<Produto> getProdutosComEstoqueAdequado() {
		return produtosComEstoqueAdequado;
	}

}
