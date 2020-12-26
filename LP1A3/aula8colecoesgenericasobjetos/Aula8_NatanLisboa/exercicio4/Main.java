package Aula8_NatanLisboa.exercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		HashSet<String> conjuntoProdutos = new HashSet<>();
		Conjunto operacoesConjunto = new Conjunto(conjuntoProdutos);
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		do {
			
			System.out.println("Exercício 4 - Conjunto de Produtos");
			System.out.println();
			System.out.println("1 - Inserir produto");
			System.out.println("2 - Consultar produtos");
			System.out.println("3 - Consultar produto pelo nome");
			System.out.println("4 - Remover produto");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma opção: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			
			switch(opcao) {
				
				case '1':
					
					String nomeProduto;
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					operacoesConjunto.inserirProdutoNoConjunto(nomeProduto);
					
					break;
				
				case '2':
					
					System.out.println("Conjunto de produtos atual: " + operacoesConjunto.getConjunto());
			
					break;
					
				case '3':
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					if (operacoesConjunto.consultarProdutoDoConjuntoPeloNome(nomeProduto)) {
						System.out.println("O produto \"" + nomeProduto + "\" está contido no conjunto");
					} else {
						System.out.println("O produto \"" + nomeProduto + "\" não está contido no conjunto");						
					}
				
					break;
				
				case '4':
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					operacoesConjunto.removerProdutoDoConjunto(nomeProduto);
					
					break;
					
				case '0':
					
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
			}
			
			System.out.println();
			
		} while (opcao != '0');
		
		System.out.println("PROGRAMA ENCERRADO");
		sc.close();
			
	}


}
