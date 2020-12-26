package Aula8_NatanLisboa.exercicio5;

import java.util.TreeSet;

public class Conjunto {
	
	private TreeSet<String> conjunto1;
	private TreeSet<String> conjunto2;
	
	public Conjunto(TreeSet<String> conjunto1, TreeSet<String> conjunto2) {
		this.conjunto1 = conjunto1;
		this.conjunto2 = conjunto2;
	}

	public TreeSet<String> getConjunto1() {
		return conjunto1;
	}

	public TreeSet<String> getConjunto2() {
		return conjunto2;
	}
	
	public void inserirProdutosNoPrimeiroConjunto(TreeSet<String> produtos) {
		conjunto1.addAll(produtos);
	}
	
	public void inserirProdutosNoSegundoConjunto(TreeSet<String> produtos) {
		conjunto2.addAll(produtos);
	}
	
	public void consultarTodosProdutos(TreeSet<String> conjunto1, TreeSet<String> conjunto2) {
		conjunto1.addAll(conjunto2);
	}
	
	public void consultarProdutosEmComum(TreeSet<String> conjunto1, TreeSet<String> conjunto2) {
		conjunto1.retainAll(conjunto2);
	}
	
	public void consultarProdutosDiferentesDoPrimeiroConjunto(TreeSet<String> conjunto1, TreeSet<String> conjunto2) {
		conjunto1.removeAll(conjunto2);
	}
	
	public boolean consultarExistenciaSubConjunto(TreeSet<String> conjunto1, TreeSet<String> conjunto2) {
		return conjunto2.containsAll(conjunto1);
	}
	
}
