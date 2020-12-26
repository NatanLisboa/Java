package Aula3_NatanLisboa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char opcao;
		double numeroMaiorIgualZero;
		
		do {
			System.out.println();
			System.out.println("Menu de opções");
			System.out.println();
			System.out.println("1 - Arredondar número");
			System.out.println("2 - Arredondar para o próximo inteiro menor");
			System.out.println("3 - Arredondar para o próximo inteiro maior");
			System.out.println("4 - Calcular raiz quadrada");
			System.out.println("5 - Calcular a potência");
			System.out.println("0 - SAIR");
			System.out.println();
			System.out.print("Digite a opção desejada: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			switch(opcao) {
				case '1':
					System.out.println("Digite um número decimal qualquer: ");
					double numeroDecimal = sc.nextDouble();
					System.out.println();
					System.out.println("Arredondamento de " + numeroDecimal + ": " + (Math.round(numeroDecimal)));
					break;
				case '2':
					System.out.println("Digite um número decimal qualquer: ");
					double numeroDecimalMenor = sc.nextDouble();
					System.out.println();
					System.out.println("Arredondamento de " + numeroDecimalMenor + " para o próximo inteiro menor: " + (Math.floor(numeroDecimalMenor)));
					break;
				case '3':
					System.out.println("Digite um número decimal qualquer: ");
					double numeroDecimalMaior = sc.nextDouble();
					System.out.println();
					System.out.println("Arredondamento de " + numeroDecimalMaior + " para o próximo inteiro maior: " + (Math.ceil(numeroDecimalMaior)));
					break;
				case '4':
					do {
						System.out.print("Digite um número maior ou igual a zero: ");
						numeroMaiorIgualZero = sc.nextDouble();
						System.out.println();
						if (numeroMaiorIgualZero >= 0) {
							System.out.println("Raiz quadrada de " + numeroMaiorIgualZero + ": " + Math.sqrt(numeroMaiorIgualZero));
						}
						else {
							System.out.println("Entrada inválida inserida");
							System.out.println();
						}
					} while (numeroMaiorIgualZero < 0);
					break;
				case '5':
					System.out.print("Digite a base: ");
					double base = sc.nextDouble();
					System.out.print("Digite o expoente: ");
					double expoente = sc.nextDouble();
					System.out.println();
					System.out.println(base + "^" + expoente + " = " + Math.pow(base, expoente));
					break;
				case '0':
					break;
				default:
					System.out.println("Opção inválida!");
			}
		} while (opcao != '0');
		
		sc.close();
	}

}
