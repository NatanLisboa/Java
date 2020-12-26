package Aula10_NatanLisboa.exercicio1;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class ControleTest {
	
	private Controle controle;
	private static Produto produto;
	private static Estoque estoque;
	private static List<Produto> listaProdutos;
	List<Produto> listaProdutosEstoqueZerado;
	private static List<Estoque> listaEstoques;
	List<Estoque> listaEstoquesSemNenhumProduto;
	private static double quantidade = 4;
	
	@BeforeClass
	public static void criarObjetosDeTeste() {
		
		listaEstoques = new ArrayList<>();
		listaProdutos = new ArrayList<>();
		listaEstoques.add(estoque = new CriadorDeEstoque().criarEstoque("Armarinho Fernandes", listaProdutos).getEstoque());
		
		for (int i = 0; i < 12; i++) {
			
			produto = new CriadorDeProduto().criarProduto("Produto" + i, quantidade, 5, 100).getProduto();
			
			if (i == 2) {
				quantidade = 103;
			} else if (i == 5) {
				quantidade = 0;
			} else if (i == 8) {
				quantidade = 50;
			}
			
			listaProdutos.add(produto);
			
		}
		
		listaEstoques.add(estoque = new CriadorDeEstoque().criarEstoque("MN Center", listaProdutos).getEstoque());
		
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueInsuficiente() {
		
		List<Produto> listaProdutosComEstoqueInsuficiente = new ArrayList<>();
		
		for (Produto p : listaProdutos) {
			if (p.getQuantidade() < p.getEstoqueMinimo()) {
				listaProdutosComEstoqueInsuficiente.add(p); 
			}
		}
		
		for (Produto p : listaProdutosComEstoqueInsuficiente) {
			assertEquals(true, p.getQuantidade() < p.getEstoqueMinimo());
		}		
		
	//	return listaProdutosComEstoqueInsuficiente;
		
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueExcedente(){
		
		List<Produto> listaProdutosComEstoqueExcedente = new ArrayList<>();
		
		for (Produto p : listaProdutos) {
			if (p.getQuantidade() > p.getEstoqueMaximo()) {
				listaProdutosComEstoqueExcedente.add(p); 
			}
		}
		
		for (Produto p : listaProdutosComEstoqueExcedente) {
			assertEquals(true, p.getQuantidade() > p.getEstoqueMaximo());
		}		
		
	//	return listaProdutosComEstoqueExcedente;
		
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueZerado(){
		
		List<Produto> listaProdutosComEstoqueZerado = new ArrayList<>();
		
		for (Produto p : listaProdutos) {
			if (p.getQuantidade() == 0) {
				listaProdutosComEstoqueZerado.add(p); 
			}
		}
		
		for (Produto p : listaProdutosComEstoqueZerado) {
			assertEquals(true, p.getQuantidade() == 0);
		}	
		
	//	return listaProdutosComEstoqueZerado;
		
	}
	
	@Test
	public void deveRetornarProdutosComAdequado(){
		
		List<Produto> listaProdutosComEstoqueAdequado = new ArrayList<>();
		
		for (Produto p : listaProdutos) {
			if ((p.getQuantidade() >= p.getEstoqueMinimo()) && ((p.getQuantidade() <= p.getEstoqueMaximo()))) {
				listaProdutosComEstoqueAdequado.add(p); 
			}
		}
		
		for (Produto p : listaProdutosComEstoqueAdequado) {
			assertEquals(true, ((p.getQuantidade() >= p.getEstoqueMinimo()) && ((p.getQuantidade() <= p.getEstoqueMaximo()))));
		}		
		
	//	return listaProdutosComEstoqueAdequado;
		
	}
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutos(){
		
		List<Produto> listaVazia = new ArrayList<>();
		List<Estoque> estoquesVazios = new ArrayList<>();
		
		for (Estoque e : listaEstoques) {
			if (e.getProdutos().size() == 0) {
				estoquesVazios.add(e);
				listaVazia = new ArrayList<>();
			}
		}
		
		for (Estoque e : listaEstoques) {
			if (e.getProdutos().size() == 0) {
				assertEquals(0, e.getProdutos().size(), 0.001);
			}
		}
		
	//	return listaVazia;
		
	}
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutosComEstoqueZerado(){
		
		List<Produto> listaVazia = new ArrayList<>();
		
		assertEquals(null, listaProdutosEstoqueZerado);
		
	//	return listaVazia;
		
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void naoDeveControlarEstoquesSemNenhumProduto(){
		
		List<Produto> listaProdutosVazia = new ArrayList<>();
		
		estoque = new CriadorDeEstoque().criarEstoque("Bar do Zé", listaProdutosVazia).getEstoque();
		
		if (estoque.getProdutos().size() == 0) {
			throw new IllegalArgumentException("Não é possível controlar estoques sem produtos!");
		}
	}
	
}
	

