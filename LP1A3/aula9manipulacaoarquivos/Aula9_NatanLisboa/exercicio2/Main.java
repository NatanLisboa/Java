package Aula9_NatanLisboa.exercicio2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale formatacaoBrasil = new Locale("pt-BR");
		Locale.setDefault(formatacaoBrasil);
		
		Scanner sc = new Scanner(System.in);
		File arquivo;
		String nomeArquivo, caminhoArquivo, opcao;
		
		do {
			
			System.out.println("Exercício 1 - Manipulação de arquivos e diretórios (parte 1)");
			System.out.println();
			System.out.println("1 - Criar arquivo");
			System.out.println("2 - Excluir arquivo");
			System.out.println("3 - Renomear arquivo");
			System.out.println("4 - Mover arquivo");
			System.out.println("5 - Criar diretório");
			System.out.println("6 - Excluir diretório");
			System.out.println("7 - Renomear diretório");
			System.out.println("8 - Mover diretório");
			System.out.println("9 - Criar arquivo e escrever nele");
			System.out.println("10 - Ler todo ou parte de um arquivo");
			System.out.println("11 - Exibir informações de um arquivo");
			System.out.println("12 - Exibir informações de um diretório");
			System.out.println("13 - Exibir todos os arquivos e subdiretórios de um diretório (com caminho)");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma opção: ");
			opcao = sc.next();
			
			System.out.println();
			
			switch (opcao) {
				
				case "1":
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (até o lugar onde o arquivo será criado): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
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
				
				case "2":
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (até o lugar onde o arquivo será deletado, sem incluir o nome): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
					if (arquivo.exists()) {
						try {
							if (Arquivo.deletarArquivo(arquivo)) {
								System.out.println("Arquivo deletado com sucesso!");
							} else {
								System.out.println("Não foi possível deletar o arquivo. Verifique o caminho especificado e tente novamente");
							}
						} catch (IOException e) {
							System.out.println("Não foi possível deletar o arquivo. Verifique se ele existe no caminho especificado e se ele não está aberto.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " não existe no caminho especificado!");
					}
					
					break;
						
				case "3":
					
					String novoNomeArquivo;
					
					System.out.print("Nome atual do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho atual do arquivo: ");
					caminhoArquivo = sc.nextLine();
					System.out.print("Novo nome do arquivo: ");
					novoNomeArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
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
				
				case "4":
					
					String novoCaminhoArquivo;
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho atual do arquivo: ");
					caminhoArquivo = sc.nextLine();
					System.out.print("Novo caminho do arquivo: ");
					novoCaminhoArquivo = sc.nextLine();
					System.out.println("Novo nome arquivo (digite apenas ENTER caso não queira renomeá-lo): ");
					novoNomeArquivo = sc.nextLine();
					
					if (novoNomeArquivo.equals("")) {
						novoNomeArquivo = nomeArquivo;
					} 
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
					if (arquivo.exists()) {
						try {
							if (Arquivo.moverArquivo(arquivo, novoCaminhoArquivo, novoNomeArquivo)) {
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
				
				case "5":
					
					String nomeDiretorio;
					String caminhoDiretorio;
					
					System.out.print("Nome do diretório: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diretório (até o lugar onde o diretório será criado): ");
					caminhoDiretorio = sc.nextLine();
					
					File diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (!diretorio.exists()) {
						try {
							if (Arquivo.criarDiretorio(diretorio)) {
								System.out.println("Diretório criado com sucesso!");
							} else {
								System.out.println("Ocorreu um erro no momento da criação do diretório. Verifique o caminho especificado e tente novamente.");
							}
						} catch (IOException e) {
							System.out.println("Não foi possível criar o diretório! Verifique suas permissões de usuário e tente novamente.");
						}
					} else {
						System.out.println("O diretório " + nomeDiretorio + " já existe no caminho especificado!");
					}
					
					break;
				
				case "6":
					
					System.out.print("Nome do diretório: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diretório (até o lugar onde o diretório será deletado, sem incluir o nome dele): ");
					caminhoDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (diretorio.exists()) {
						try {
							if (Arquivo.deletarArquivo(diretorio)) {
								System.out.println("Diretorio deletado com sucesso!");
							} else {
								System.out.println("Não foi possível deletar o diretório. Verifique o caminho especificado e tente novamente");
							}
						} catch (IOException e) {
							System.out.println("Não foi possível deletar o diretório. Verifique se ele existe no caminho especificado e está vazio.");
						}
					} else {
						System.out.println("O diretório " + nomeDiretorio + " não existe no caminho especificado!");
					}
					
					break;
					
				case "7":
					
					String novoNomeDiretorio;
					
					System.out.print("Nome atual do diretório: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho atual do diretório: ");
					caminhoDiretorio = sc.nextLine();
					System.out.print("Novo nome do diretório: ");
					novoNomeDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (diretorio.exists()) {
						try {
							if (Arquivo.renomearArquivo(caminhoDiretorio, diretorio, novoNomeDiretorio)) {
								System.out.println("Diretório renomeado com sucesso");
							} else {
								System.out.println("Não foi possível renomear o diretório. Por favor, verifique o caminho digitado e tente novamente.");
							}
						} catch (IOException e) {
							System.out.println("Não foi possível renomear o diretório especificado. Verifique se o diretório existe no caminho informado.");
						}
					} else {
						System.out.println("O diretório " + nomeDiretorio + " não existe no caminho especificado!");
					}
					
					break;
					
				case "8":
					
					String novoCaminhoDiretorio;
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho atual do arquivo: ");
					caminhoDiretorio = sc.nextLine();
					System.out.print("Novo caminho do arquivo: ");
					novoCaminhoDiretorio = sc.nextLine();
					System.out.println("Novo nome arquivo (digite apenas ENTER caso não queira renomeá-lo): ");
					novoNomeDiretorio = sc.nextLine();
					
					if (novoNomeDiretorio.equals("")) {
						novoNomeDiretorio = nomeDiretorio;
					} 
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (diretorio.exists()) {
						try {
							if (Arquivo.moverArquivo(diretorio, novoCaminhoDiretorio, novoNomeDiretorio)) {
								System.out.println("Diretório movido com sucesso");
							} else {
								System.out.println("O sistema não conseguiu identificar o caminho de destino do diretório. Por favor, verifique-o e tente novamente.");								
							}
						} catch (IOException e) {
							System.out.println("Não foi possível mover o diretório especificado. Verifique se o diretório existe no caminho informado.");
						}
					} else {
						System.out.println("O diretório " + nomeDiretorio + " não existe no caminho especificado!");
					}
					
					break;
					
				case "9":
					
					String conteudoArquivo;
					char modoEscrita;
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (até o lugar onde o arquivo será criado): ");
					caminhoArquivo = sc.nextLine();
					System.out.print("Conteúdo do arquivo: ");
					conteudoArquivo = sc.nextLine();
					
					do {
						
						System.out.println();
						System.out.println("1 - Sobrescrever conteúdo do arquivo");
						System.out.println("2 - Adicionar novo conteúdo na última linha do arquivo");
						System.out.println();
						
						System.out.print("Modo de escrita da mensagem (Digite 1 ou 2): ");
						modoEscrita = sc.next().charAt(0);
						
						if (!(modoEscrita == '1' || modoEscrita == '2')) {
							System.out.println("Opção inválida! Por favor, digite 1 ou 2");
						}
						
					} while (!(modoEscrita == '1' || modoEscrita == '2'));
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					if (Arquivo.criarArquivoEEscrever(arquivo, caminhoArquivo, nomeArquivo, conteudoArquivo, modoEscrita)) {
						System.out.println("Arquivo criado e preenchido com sucesso!");
					} else {
						System.out.println("Ocorreu um erro ao criar o arquivo ou ao escrever nele. Por favor, verifique o caminho especificado e suas permissões de usuário e tente novamente.");
					}
					
					break;
					
				case "10":
					
					char lerTodoOuParte;
						
						System.out.print("Nome do arquivo: ");
						sc.nextLine();
						nomeArquivo = sc.nextLine();
						System.out.print("Caminho do arquivo (até o lugar onde o arquivo está): ");
						caminhoArquivo = sc.nextLine();
						do {
							
							System.out.print("Ler todas as linhas ou parte do arquivo (t/p): ");
							lerTodoOuParte = sc.next().toLowerCase().charAt(0);
							
							arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
							
							System.out.println();
							
							switch(lerTodoOuParte) {					
								case 't':
									Arquivo.lerArquivo(arquivo);
									break;
								case 'p':								
									System.out.print("Linha inicial: ");
									int linhaInicial = sc.nextInt();
									System.out.print("Linha final: ");
									int linhaFinal = sc.nextInt();
									System.out.println();
									Arquivo.lerArquivo(arquivo, linhaInicial, linhaFinal);
									break;
								default:
									System.out.println("Opção inválida! Digite \"t\" para ler todo o arquivo e \"p\" para ler parte dele");
									System.out.println();
									
							}	
							
						} while (!(lerTodoOuParte == 't' || lerTodoOuParte == 'p'));
						
					break;
				
				case "11":
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (até o lugar onde o arquivo está): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
					Arquivo.exibirInformacoes(arquivo);
					
					break;
				
				case "12":
					
					System.out.print("Nome do diretório: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diretório (até o lugar onde o diretório está): ");
					caminhoDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					Arquivo.exibirInformacoes(diretorio);
					
					break;
				
				case "13":
					
					System.out.print("Nome do diretório: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diretório (até o lugar onde o diretório está, sem incluir o nome dele): ");
					caminhoDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					Arquivo.exibirConteudoDiretorio(diretorio);
					
					break;
					
				case "0":
					
					break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
			
			}
			
			Thread.currentThread();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("O PROGRAMA FOI ENCERRADO PELO USUÁRIO!");
			}
			
			System.out.println();
			
		} while (!opcao.equals("0"));
		
		System.out.println("PROGRAMA ENCERRADO");
		sc.nextLine();
		sc.close();
		
	}

}
