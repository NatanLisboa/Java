package Aula8_NatanLisboa.exercicio2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> filaPessoas = new LinkedList<>();
		Fila operacoesFila = new Fila(filaPessoas);
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		do {
			
			System.out.println("Exercício 2 - Fila de Pessoas");
			System.out.println();
			System.out.println("1 - Inserir pessoa");
			System.out.println("2 - Remover pessoa");
			System.out.println("3 - Imprimir fila");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma opção: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			
			switch(opcao) {
				case '1':
					
					String nomePessoa;
					
					System.out.print("Nome da pessoa: ");
					sc.nextLine();
					nomePessoa = sc.nextLine();
					
					operacoesFila.inserirPessoaNaFila(nomePessoa);
					
					break;
				
				case '2':
					
					operacoesFila.removerPessoaDaFila();
					
					break;
					
				case '3':
					
					System.out.println("Fila atual: " + operacoesFila.getFila());
					
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
