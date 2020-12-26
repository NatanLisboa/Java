package exercicio1;

public class Venda {
	
	private static double soma = 0;
	
	public void calcularVenda(double valor) {
		
		soma += valor;
		
	}

	public double getSoma() {
		
		return soma;
		
	}
	
	
	
}
