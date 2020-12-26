package Aula6_NatanLisboa.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char opcao;
		
		do {
			
			System.out.println();
			System.out.println("CALCULADORA SIMPLES");
			System.out.println();
			System.out.println("1 - Calcular raiz quadrada");
			System.out.println("2 - Calcular potenciação");
			System.out.println("3 - Calcular fatorial");
			System.out.println("0 - SAIR");
			System.out.println();
			System.out.print("Selecione a opção desejada (Digite um número entre 0 e 3): ");
			opcao = teclado.next().charAt(0);
			
			switch (opcao) {
				
				case '1':
					
					double numDouble = 0.0f;
					
					while (true) {
						
						try {
							System.out.print("Digite um número positivo qualquer: ");
							numDouble = teclado.nextDouble();
							if (numDouble < 0.0) {
								System.out.println("Número inválido! Por favor, insira um número positivo");
								continue;
							}
							System.out.println("Raiz quadrada de " + numDouble + " = " + Calculo.executarCalculo(numDouble));
							break;
						} catch (InputMismatchException e) {
							System.out.println("Erro: Tipo inválido inserido!");
							teclado.nextLine();
						}
												
					}
					
					break;
				
				case '2':
					
					double base = 0.0f;
				
					while (true) {
						
						try {
							System.out.print("Base: ");
							base = teclado.nextDouble();
							break;
						} catch (InputMismatchException e) {
							System.out.println("Erro: Tipo inválido inserido! Tente novamente.");
							teclado.nextLine();
						}
					}
						
					double expoente = 0.0f;
					
					while (true) {
						
						try {
							System.out.print("Expoente: ");
							expoente = teclado.nextDouble();
							System.out.println();
							System.out.println(base + "^" + expoente + "=" + Calculo.executarCalculo(base, expoente));
							break;
						} catch (InputMismatchException e) {
							System.out.println("Erro: Tipo inválido inserido! Tente novamente.");
							teclado.nextLine();
						}
					}
						
					break;
				
				case '3':
					
					int numInteiro = 0;
				
					while (true) {
						try {
							System.out.print("Digite um número inteiro para cálculo do fatorial: ");
							numInteiro = teclado.nextInt();
							if (numInteiro < 0) {
								System.out.println("Não é possível calcular fatorial de números negativos. Tente novamente.");
								continue;
							}
							break;
						} catch (InputMismatchException e) {
							System.out.println("Erro: Tipo inválido inserido!");
							teclado.nextLine();
						}
					}	
					
					System.out.print(numInteiro + "! = ");
					System.out.println(Calculo.executarCalculo(numInteiro));
					
					break;
				
				case '0':
					
					break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA! POR FAVOR, DIGITE UM NÚMERO ENTRE 0 E 3");
			
			}		
			
		} while (opcao != '0');
		
		teclado.close();
		
	}

}
