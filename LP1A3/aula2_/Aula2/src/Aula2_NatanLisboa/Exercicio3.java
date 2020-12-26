package Aula2_NatanLisboa;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double faturamentoMes;
		double faturamentoTotal = 0;
		
		System.out.println("Exercício 3");
		
		for (short mes=1; mes<=12; mes++) {
			
			System.out.println("");
			
			System.out.print("Digite o faturamento obtido no " + mes + "º mês: ");
			faturamentoMes = sc.nextDouble();
			
			faturamentoTotal += faturamentoMes;
			
		}
		
		System.out.println("");
		System.out.print("O faturamento obtido no ano foi ");
		
		if (faturamentoTotal <= 50000) 
			System.out.print("baixo");
		else if ((faturamentoTotal > 50000) && (faturamentoTotal <= 100000))
			System.out.print("médio");
		else 
			System.out.print("alto");
		
		sc.close();
		
	}

}
