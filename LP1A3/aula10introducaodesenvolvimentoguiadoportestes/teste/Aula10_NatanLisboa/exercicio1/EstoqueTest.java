package Aula10_NatanLisboa.exercicio1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EstoqueTest {

	// (Apagados) = Ativa a falha (Failure) do assertEquals
	
	private Estoque estoque;
	private List<Produto> listaProdutos;
	private Produto produto;
	
	@Before
	public void criarEstoqueParaTeste() {
		listaProdutos = new ArrayList<Produto>();
		for (int i = 0; i < 4; i++) {
		// 	if (i < 3) {
				produto = new CriadorDeProduto().criarProduto("Produto" + i, 19, 5, 100).getProduto();
		//	} else {
		//		produto = new CriadorDeProduto().criarProduto("Produto0", 19, 5, 100).getProduto();
		//	}
			listaProdutos.add(produto);
		}
		
		estoque = new CriadorDeEstoque().criarEstoque("MN Center", listaProdutos).getEstoque();
	}
	
	@Test
	public void naoDeveAceitarProdutosComMesmoNome() {
		
		for (int i = 0; i < estoque.getProdutos().size(); i++) {
			for (int j = 0; j < estoque.getProdutos().size(); j++) {
				if (i == j) {
					continue;
				} else {
					assertEquals(false, estoque.getProdutos().get(i).getNome().equalsIgnoreCase(estoque.getProdutos().get(j).getNome()));
				}
			}
		}
	}
		
		
		
}
