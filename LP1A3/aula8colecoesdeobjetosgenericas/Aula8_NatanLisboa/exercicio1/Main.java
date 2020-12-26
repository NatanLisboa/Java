package Aula8_NatanLisboa.exercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char opcao;
		ArrayList<String> listaProdutos = new ArrayList<>();
		Lista operacoesLista = new Lista(listaProdutos);
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("Exerc�cio 1 - Lista de Produtos");
			System.out.println();
			System.out.println("Lista de produtos atual: " + operacoesLista.getLista());
			System.out.println();
			System.out.println("1 - Inserir produto");
			System.out.println("2 - Inserir produto em posi��o espec�fica");
			System.out.println("3 - Consultar produto pelo nome");
			System.out.println("4 - Consultar produto pela posi��o");
			System.out.println("5 - Substituir produto");
			System.out.println("6 - Remover produto pelo nome");
			System.out.println("7 - Remover produto pela posi��o");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma op��o: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			
			switch (opcao) {
				
				case '1':
					
					String nomeProduto;
					int posicao;
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					operacoesLista.inserirProduto(nomeProduto);
					
					break;
					
				case '2':
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					System.out.print("Posi��o de inser��o: ");
					try {
						posicao = sc.nextInt();
						operacoesLista.inserirProdutoEmPosicaoEspecifica(nomeProduto, posicao);
					} catch (InputMismatchException e) {
						System.out.println();
					}
					
					break;
					
				case '3':
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					int indiceProdutoPesquisado = operacoesLista.consultarProdutoPeloNome(nomeProduto);
					
					if ((indiceProdutoPesquisado) != -1) {
						System.out.println("O produto \"" + nomeProduto + "\" foi encontrado na posi��o " + indiceProdutoPesquisado + " da lista");
					} else {
						System.out.println("O produto \"" + nomeProduto + "\" n�o foi encontrado");
					}
					
					break;
					
				case '4':
					
					System.out.print("Posi��o do produto: ");
					posicao = sc.nextInt();
					
					System.out.println("Produto na posi��o " + posicao + " da lista: \"" + operacoesLista.consultarProdutoPelaPosicao(posicao) + "\"");
					
					break;
					
				case '5':
					
					System.out.print("Posi��o do produto atual: ");
					posicao = sc.nextInt();
					System.out.print("Nome do novo produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					operacoesLista.substituirProduto(posicao, nomeProduto);
					
					break;
					
				case '6':
					
					System.out.print("Nome do produto: ");
					sc.nextLine();
					nomeProduto = sc.nextLine();
					
					operacoesLista.removerProdutoPeloNome(nomeProduto);
					
					break;
					
				case '7':
					
					System.out.print("Posi��o do produto: ");
					posicao = sc.nextInt();
					
					operacoesLista.removerProdutoPelaPosicao(posicao);
					
					break;
					
				case '0':
					
					break;
					
				default:
					System.out.println("OP��O INV�LIDA!");
			}
			
			System.out.println();
			
		} while (opcao != '0');
		
		System.out.println("PROGRAMA ENCERRADO");
		sc.close();
		
	}

}
