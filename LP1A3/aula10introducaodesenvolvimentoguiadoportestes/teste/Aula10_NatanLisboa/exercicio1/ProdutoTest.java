package Aula10_NatanLisboa.exercicio1;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProdutoTest {

	private static Produto produto;
	private static List<Produto> listaProdutos;
	
	@BeforeClass
	public static void criarProdutosParaTeste() {
		
		listaProdutos = new ArrayList<Produto>();
				
		for (int i = 0; i < 4; i++) {
			if (i < 2) {
				produto = new CriadorDeProduto().criarProduto("Produto" + i, 5, 5, 100).getProduto();
			} else if (i == 2) { // Projeta exceção do primeiro método
				produto = new CriadorDeProduto().criarProduto("Produto" + i, 5, (5 - i), 100).getProduto();
			} else { // Projeta exceção do segundo método
				produto = new CriadorDeProduto().criarProduto("Produto" + i, 5, 5, (100 + i)).getProduto();
			}
			listaProdutos.add(produto);
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarProdutosComEstoqueMinimoMenorQueCinco() {
		
		for (Produto p : listaProdutos) {
			if (p.getEstoqueMinimo() < 5) {
				throw new IllegalArgumentException("Produto com menos de 5 unidades no estoque inserido!");
			}
		}
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarProdutosComEstoqueMaximoMaiorQueCem() {
		
		for (Produto p : listaProdutos) {
			if (p.getEstoqueMaximo() > 100) {
				throw new IllegalArgumentException("Produto com mais de 100 unidades no estoque inserido!");
			}
		}
		
	}
	
}
