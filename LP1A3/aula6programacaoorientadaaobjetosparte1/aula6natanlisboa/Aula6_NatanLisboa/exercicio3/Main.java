package exercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char opcao;
		Pesquisa p = new Pesquisa();
		Pesquisa pf = new PesquisaFim();
		Pesquisa pi = new PesquisaInicio();
		
		Pesquisa.texto = "";
		
		do {
			
			System.out.println();
			System.out.println("Texto: " + Pesquisa.texto);
			System.out.println();
			System.out.println("1 - Informar texto");
			System.out.println("2 - Buscar string");
			System.out.println("3 - Buscar string no início");
			System.out.println("4 - Buscar string no fim");
			System.out.println("0 - SAIR");
			
			System.out.println();
			
			System.out.print("Escolha uma opção (Digite um número de 0 a 4): ");
			opcao = teclado.next().charAt(0);
			
			System.out.println();
			System.out.println();
			
			teclado.nextLine();
			
			switch(opcao) {
				
				case '1':
					
					System.out.print("Digite um texto para análise: ");
					Pesquisa.texto = teclado.nextLine();
					
					break;
				
				case '2':
					
					System.out.print("Digite a string a ser procurada: ");
					String textoParaSerAnalisado = teclado.nextLine();
					
					System.out.println();
					if (p.buscarString(textoParaSerAnalisado)) {
						System.out.println("TRECHO " + textoParaSerAnalisado + " ENCONTRADO NO TEXTO!");
					} else {
						System.out.println("TRECHO NÃO ENCONTRADO NO TEXTO");
					}
					
					break;
					
				case '3':
					
					System.out.print("Digite a string a ser procurada no início do texto: ");
					String textoParaSerAnalisadoInicio = teclado.nextLine();
					
					System.out.println();
					if (pi.buscarString(textoParaSerAnalisadoInicio)) {
						System.out.println("O TRECHO \"" + textoParaSerAnalisadoInicio + "\" FOI ENCONTRADO NO INÍCIO DO TEXTO");
					} else {
						System.out.println("O TRECHO \"" + textoParaSerAnalisadoInicio + "\" NÃO FOI ENCONTRADO NO INÍCIO DO TEXTO");
					}
					
					break;
				
				case '4':
					
					System.out.print("Digite a string a ser procurada no final do texto: ");
					String textoParaSerAnalisadoFim = teclado.nextLine();
					
					System.out.println();
					if (pf.buscarString(textoParaSerAnalisadoFim)) {
						System.out.println("O TRECHO \"" + textoParaSerAnalisadoFim + "\" FOI ENCONTRADO NO FINAL DO TEXTO");
					} else {
						System.out.println("O TRECHO \"" + textoParaSerAnalisadoFim + "\" NÃO FOI ENCONTRADO NO FINAL DO TEXTO");
					}
					
					
					break;
				
				case '0':
					
					break;
					
				default:
					
					System.out.println("OPÇÃO INVÁLIDA!");
					
			}
				
		} while (opcao != '0');
		
		teclado.close();
		
	}

}
