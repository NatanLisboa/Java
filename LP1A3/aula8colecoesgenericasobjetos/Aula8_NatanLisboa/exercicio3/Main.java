package Aula8_NatanLisboa.exercicio3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> pilhaLivros = new LinkedList<>();
		Pilha operacoesPilha = new Pilha(pilhaLivros);
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		do {
			
			System.out.println("Exercício 3 - Pilha de livros");
			System.out.println();
			System.out.println("1 - Inserir livro");
			System.out.println("2 - Remover livro");
			System.out.println("3 - Imprimir pilha");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma opção: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			
			switch(opcao) {
				case '1':
					
					String tituloLivro;
					
					System.out.print("Título do livro: ");
					sc.nextLine();
					tituloLivro = sc.nextLine();
					
					operacoesPilha.inserirLivroNaPilha(tituloLivro);
					
					break;
				
				case '2':
					
					operacoesPilha.removerLivroDaPilha();
					
					break;
					
				case '3':
					
					System.out.println("Pilha de livros atual: " + operacoesPilha.getPilha());
					
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
