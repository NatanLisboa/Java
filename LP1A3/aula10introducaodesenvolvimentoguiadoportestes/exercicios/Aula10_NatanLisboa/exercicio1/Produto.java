package Aula10_NatanLisboa.exercicio1;

public class Produto {

	private String nome;
	private double quantidade;
	private double estoqueMinimo;
	private double estoqueMaximo;
	
	public Produto() {
		
	}

	public Produto(String nome, double quantidade, double estoqueMinimo, double estoqueMaximo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public String getNome() {
		return nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public double getEstoqueMaximo() {
		return estoqueMaximo;
	}
	
}
