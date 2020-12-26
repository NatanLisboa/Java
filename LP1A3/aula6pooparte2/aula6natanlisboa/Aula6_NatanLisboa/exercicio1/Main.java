package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Venda v1 = new Venda();
		Venda v2 = new Venda();
		
		for (int i = 1; i <= 6; i++) {
			System.out.print(i + "º mês: R$");
			v1.calcularVenda(teclado.nextDouble());
		}
		
		System.out.println();
		System.out.println("Soma das vendas dos 6 primeiros meses: R$" + v2.getSoma());
		
		teclado.close();
	}
	
}
