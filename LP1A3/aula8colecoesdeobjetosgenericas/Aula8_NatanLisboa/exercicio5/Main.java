package Aula8_NatanLisboa.exercicio5;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<String> conjuntoProdutos1 = new TreeSet<>();
		TreeSet<String> conjuntoProdutos2 = new TreeSet<>();
		Conjunto operacoesConjuntos = new Conjunto(conjuntoProdutos1, conjuntoProdutos2);
		TreeSet<String> conjuntoAux = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		do {
			
			System.out.println("Exercício 5 - Operações com Conjuntos de Produtos");
			System.out.println();
			System.out.println("Conjunto 1 = " + conjuntoProdutos1);
			System.out.println("Conjunto 2 = " + conjuntoProdutos2);
			System.out.println();
			System.out.println("1 - Inserir produtos no primeiro conjunto");
			System.out.println("2 - Inserir produtos no segundo conjunto");
			System.out.println("3 - Consultar todos produtos dos dois conjuntos (união)");
			System.out.println("4 - Consultar apenas produtos em comum nos dois conjuntos (intersecção)");
			System.out.println("5 - Consultar produtos do primeiro conjunto que não existem no segundo conjunto (diferença)");
			System.out.println("6 - Consultar se o primeiro conjunto está contido no segundo conjunto (verificação de subconjuntos)");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma opção: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			
			switch(opcao) {
				
				case '1':
					
					int quantidadeProdutos;
					
					System.out.print("Quantidade de produtos: ");
					quantidadeProdutos = sc.nextInt();
					
					for (int i = 1; i <= quantidadeProdutos; i++) {
						System.out.print("Nome do " + i + "º produto: ");
						if (i == 1) {
							sc.nextLine();
						}
						conjuntoAux.add(sc.nextLine());
					}
					
					operacoesConjuntos.inserirProdutosNoPrimeiroConjunto(conjuntoAux);
					
					break;
				
				case '2':
					
					System.out.print("Quantidade de produtos: ");
					quantidadeProdutos = sc.nextInt();
					
					for (int i = 1; i <= quantidadeProdutos; i++) {
						System.out.print("Nome do " + i + "º produto: ");
						if (i == 1) {
							sc.nextLine();
						}
						conjuntoAux.add(sc.nextLine());
					}
					
					operacoesConjuntos.inserirProdutosNoSegundoConjunto(conjuntoAux);
					
					break;

				case '3':
					
					operacoesConjuntos.consultarTodosProdutos(conjuntoProdutos1, conjuntoProdutos2);
					
					System.out.println("Conjunto 1 U Conjunto 2 = " + conjuntoProdutos1);
					
					break;
				
				case '4':
					
					operacoesConjuntos.consultarProdutosEmComum(conjuntoProdutos1, conjuntoProdutos2);
					
					System.out.println("Conjunto 1 ∩ Conjunto 2 = " + conjuntoProdutos1);
					
					break;
					
				case '5':
					
					operacoesConjuntos.consultarProdutosDiferentesDoPrimeiroConjunto(conjuntoProdutos1, conjuntoProdutos2);
					
					System.out.println("Conjunto 1 - Conjunto 2 = " + conjuntoProdutos1);
					
					break;
					
				case '6':
					
					System.out.print("O conjunto 1 ");
					
					if (!operacoesConjuntos.consultarExistenciaSubConjunto(conjuntoProdutos1, conjuntoProdutos2)) {
						System.out.print("NÃO ");
					}
					
					System.out.println("está contido no conjunto 2");
					
					break;
					
				case '0':
					
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
			}
			
			conjuntoAux.clear();
			
			System.out.println();
			
		} while (opcao != '0');
		
		System.out.println("PROGRAMA ENCERRADO");
		sc.close();
			
	}

}
