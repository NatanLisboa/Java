package Aula9_NatanLisboa.exercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char opcao;
		File arquivo;
		String nomeArquivo, caminhoArquivo;
		
		do {
			
			System.out.println("Exercício 1 - Manipulação de arquivos e diretórios (parte 1)");
			System.out.println();
			System.out.println("1 - Criar arquivo");
			System.out.println("2 - Excluir arquivo");
			System.out.println("3 - Renomear arquivo");
			System.out.println("4 - Mover arquivo");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma opção: ");
			opcao = sc.next().charAt(0);
			
			System.out.println();
			
			switch (opcao) {
				
				case '1':
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (até o lugar onde o arquivo será criado): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					if (!arquivo.exists()) {
						if (Arquivo.criarArquivo(arquivo)) {
							System.out.println("Arquivo criado com sucesso!");
						} else {
							System.out.println("Ocorreu um erro no momento da criação do arquivo. Verifique o caminho especificado e tente novamente.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " já existe no caminho especificado!");
					}
					
					break;
				
				case '2':
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (até o lugar onde o arquivo será deletado, sem incluir o nome): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					if (arquivo.exists()) {
						try {
							if (Arquivo.deletarArquivo(arquivo)) {
								System.out.println("Arquivo deletado com sucesso!");
							} else {
								System.out.println("Não foi possível deletar o arquivo. Verifique o caminho especificado e tente novamente");
							}
						} catch (IOException e) {
							System.out.println("Não foi possível deletar o arquivo. Verifique se ele existe no caminho especificado");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " não existe no caminho especificado!");
					}
					
					break;
						
				case '3':
					
					String novoNomeArquivo;
					
					System.out.print("Nome atual do arquivo: ");
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho atual do arquivo: ");
					sc.nextLine();
					caminhoArquivo = sc.nextLine();
					System.out.print("Novo nome do arquivo: ");
					novoNomeArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					if (arquivo.exists()) {
						try {
							if (Arquivo.renomearArquivo(caminhoArquivo, arquivo, novoNomeArquivo)) {
								System.out.println("Arquivo renomeado com sucesso");
							} else {
								System.out.println("Não foi possível renomear o arquivo. Por favor, verifique o caminho digitado e tente novamente.");
							}
						} catch (IOException e) {
							System.out.println("Não foi possível renomear o arquivo especificado. Verifique se o arquivo existe no caminho informado.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " não existe no caminho especificado!");
					}
					
					break;
				
				case '4':
					
					String novoCaminhoArquivo;
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho atual do arquivo: ");
					caminhoArquivo = sc.nextLine();
					System.out.print("Novo caminho do arquivo: ");
					novoCaminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					if (arquivo.exists()) {
						try {
							if (Arquivo.moverArquivo(arquivo, novoCaminhoArquivo, nomeArquivo)) {
								System.out.println("Arquivo movido com sucesso");
							} else {
								System.out.println("O sistema não conseguiu identificar o caminho de destino do arquivo. Por favor, verifique-o e tente novamente.");								
							}
						} catch (IOException e) {
							System.out.println("Não foi possível mover o arquivo especificado. Verifique se o arquivo existe no caminho informado.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " não existe no caminho especificado!");
					}
					
					break;
				
				case '0':
					
					break;
				
				default:
					System.out.println("Opção inválida");
					
			}
			
			System.out.println();
			
		} while (opcao != '0');
		
		System.out.println("PROGRAMA ENCERRADO");
		sc.close();
		
	}

}
