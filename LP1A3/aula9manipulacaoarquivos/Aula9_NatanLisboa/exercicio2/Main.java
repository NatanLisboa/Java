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
			
			System.out.println("Exerc�cio 1 - Manipula��o de arquivos e diret�rios (parte 1)");
			System.out.println();
			System.out.println("1 - Criar arquivo");
			System.out.println("2 - Excluir arquivo");
			System.out.println("3 - Renomear arquivo");
			System.out.println("4 - Mover arquivo");
			System.out.println("5 - Criar diret�rio");
			System.out.println("6 - Excluir diret�rio");
			System.out.println("7 - Renomear diret�rio");
			System.out.println("8 - Mover diret�rio");
			System.out.println("9 - Criar arquivo e escrever nele");
			System.out.println("10 - Ler todo ou parte de um arquivo");
			System.out.println("11 - Exibir informa��es de um arquivo");
			System.out.println("12 - Exibir informa��es de um diret�rio");
			System.out.println("13 - Exibir todos os arquivos e subdiret�rios de um diret�rio (com caminho)");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Selecione uma op��o: ");
			opcao = sc.next();
			
			System.out.println();
			
			switch (opcao) {
				
				case "1":
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (at� o lugar onde o arquivo ser� criado): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
					if (!arquivo.exists()) {
						if (Arquivo.criarArquivo(arquivo)) {
							System.out.println("Arquivo criado com sucesso!");
						} else {
							System.out.println("Ocorreu um erro no momento da cria��o do arquivo. Verifique o caminho especificado e tente novamente.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " j� existe no caminho especificado!");
					}
					
					break;
				
				case "2":
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (at� o lugar onde o arquivo ser� deletado, sem incluir o nome): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
					if (arquivo.exists()) {
						try {
							if (Arquivo.deletarArquivo(arquivo)) {
								System.out.println("Arquivo deletado com sucesso!");
							} else {
								System.out.println("N�o foi poss�vel deletar o arquivo. Verifique o caminho especificado e tente novamente");
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel deletar o arquivo. Verifique se ele existe no caminho especificado e se ele n�o est� aberto.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " n�o existe no caminho especificado!");
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
								System.out.println("N�o foi poss�vel renomear o arquivo. Por favor, verifique o caminho digitado e tente novamente.");
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel renomear o arquivo especificado. Verifique se o arquivo existe no caminho informado.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " n�o existe no caminho especificado!");
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
					System.out.println("Novo nome arquivo (digite apenas ENTER caso n�o queira renome�-lo): ");
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
								System.out.println("O sistema n�o conseguiu identificar o caminho de destino do arquivo. Por favor, verifique-o e tente novamente.");								
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel mover o arquivo especificado. Verifique se o arquivo existe no caminho informado.");
						}
					} else {
						System.out.println("O arquivo " + nomeArquivo + " n�o existe no caminho especificado!");
					}
					
					break;
				
				case "5":
					
					String nomeDiretorio;
					String caminhoDiretorio;
					
					System.out.print("Nome do diret�rio: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diret�rio (at� o lugar onde o diret�rio ser� criado): ");
					caminhoDiretorio = sc.nextLine();
					
					File diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (!diretorio.exists()) {
						try {
							if (Arquivo.criarDiretorio(diretorio)) {
								System.out.println("Diret�rio criado com sucesso!");
							} else {
								System.out.println("Ocorreu um erro no momento da cria��o do diret�rio. Verifique o caminho especificado e tente novamente.");
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel criar o diret�rio! Verifique suas permiss�es de usu�rio e tente novamente.");
						}
					} else {
						System.out.println("O diret�rio " + nomeDiretorio + " j� existe no caminho especificado!");
					}
					
					break;
				
				case "6":
					
					System.out.print("Nome do diret�rio: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diret�rio (at� o lugar onde o diret�rio ser� deletado, sem incluir o nome dele): ");
					caminhoDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (diretorio.exists()) {
						try {
							if (Arquivo.deletarArquivo(diretorio)) {
								System.out.println("Diretorio deletado com sucesso!");
							} else {
								System.out.println("N�o foi poss�vel deletar o diret�rio. Verifique o caminho especificado e tente novamente");
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel deletar o diret�rio. Verifique se ele existe no caminho especificado e est� vazio.");
						}
					} else {
						System.out.println("O diret�rio " + nomeDiretorio + " n�o existe no caminho especificado!");
					}
					
					break;
					
				case "7":
					
					String novoNomeDiretorio;
					
					System.out.print("Nome atual do diret�rio: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho atual do diret�rio: ");
					caminhoDiretorio = sc.nextLine();
					System.out.print("Novo nome do diret�rio: ");
					novoNomeDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (diretorio.exists()) {
						try {
							if (Arquivo.renomearArquivo(caminhoDiretorio, diretorio, novoNomeDiretorio)) {
								System.out.println("Diret�rio renomeado com sucesso");
							} else {
								System.out.println("N�o foi poss�vel renomear o diret�rio. Por favor, verifique o caminho digitado e tente novamente.");
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel renomear o diret�rio especificado. Verifique se o diret�rio existe no caminho informado.");
						}
					} else {
						System.out.println("O diret�rio " + nomeDiretorio + " n�o existe no caminho especificado!");
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
					System.out.println("Novo nome arquivo (digite apenas ENTER caso n�o queira renome�-lo): ");
					novoNomeDiretorio = sc.nextLine();
					
					if (novoNomeDiretorio.equals("")) {
						novoNomeDiretorio = nomeDiretorio;
					} 
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					if (diretorio.exists()) {
						try {
							if (Arquivo.moverArquivo(diretorio, novoCaminhoDiretorio, novoNomeDiretorio)) {
								System.out.println("Diret�rio movido com sucesso");
							} else {
								System.out.println("O sistema n�o conseguiu identificar o caminho de destino do diret�rio. Por favor, verifique-o e tente novamente.");								
							}
						} catch (IOException e) {
							System.out.println("N�o foi poss�vel mover o diret�rio especificado. Verifique se o diret�rio existe no caminho informado.");
						}
					} else {
						System.out.println("O diret�rio " + nomeDiretorio + " n�o existe no caminho especificado!");
					}
					
					break;
					
				case "9":
					
					String conteudoArquivo;
					char modoEscrita;
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (at� o lugar onde o arquivo ser� criado): ");
					caminhoArquivo = sc.nextLine();
					System.out.print("Conte�do do arquivo: ");
					conteudoArquivo = sc.nextLine();
					
					do {
						
						System.out.println();
						System.out.println("1 - Sobrescrever conte�do do arquivo");
						System.out.println("2 - Adicionar novo conte�do na �ltima linha do arquivo");
						System.out.println();
						
						System.out.print("Modo de escrita da mensagem (Digite 1 ou 2): ");
						modoEscrita = sc.next().charAt(0);
						
						if (!(modoEscrita == '1' || modoEscrita == '2')) {
							System.out.println("Op��o inv�lida! Por favor, digite 1 ou 2");
						}
						
					} while (!(modoEscrita == '1' || modoEscrita == '2'));
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					if (Arquivo.criarArquivoEEscrever(arquivo, caminhoArquivo, nomeArquivo, conteudoArquivo, modoEscrita)) {
						System.out.println("Arquivo criado e preenchido com sucesso!");
					} else {
						System.out.println("Ocorreu um erro ao criar o arquivo ou ao escrever nele. Por favor, verifique o caminho especificado e suas permiss�es de usu�rio e tente novamente.");
					}
					
					break;
					
				case "10":
					
					char lerTodoOuParte;
						
						System.out.print("Nome do arquivo: ");
						sc.nextLine();
						nomeArquivo = sc.nextLine();
						System.out.print("Caminho do arquivo (at� o lugar onde o arquivo est�): ");
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
									System.out.println("Op��o inv�lida! Digite \"t\" para ler todo o arquivo e \"p\" para ler parte dele");
									System.out.println();
									
							}	
							
						} while (!(lerTodoOuParte == 't' || lerTodoOuParte == 'p'));
						
					break;
				
				case "11":
					
					System.out.print("Nome do arquivo: ");
					sc.nextLine();
					nomeArquivo = sc.nextLine();
					System.out.print("Caminho do arquivo (at� o lugar onde o arquivo est�): ");
					caminhoArquivo = sc.nextLine();
					
					arquivo = new File(caminhoArquivo + "\\" + nomeArquivo);
					
					System.out.println();
					
					Arquivo.exibirInformacoes(arquivo);
					
					break;
				
				case "12":
					
					System.out.print("Nome do diret�rio: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diret�rio (at� o lugar onde o diret�rio est�): ");
					caminhoDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					Arquivo.exibirInformacoes(diretorio);
					
					break;
				
				case "13":
					
					System.out.print("Nome do diret�rio: ");
					sc.nextLine();
					nomeDiretorio = sc.nextLine();
					System.out.print("Caminho do diret�rio (at� o lugar onde o diret�rio est�, sem incluir o nome dele): ");
					caminhoDiretorio = sc.nextLine();
					
					diretorio = new File(caminhoDiretorio + "\\" + nomeDiretorio);
					
					System.out.println();
					
					Arquivo.exibirConteudoDiretorio(diretorio);
					
					break;
					
				case "0":
					
					break;
				
				default:
					System.out.println("OP��O INV�LIDA!");
			
			}
			
			Thread.currentThread();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("O PROGRAMA FOI ENCERRADO PELO USU�RIO!");
			}
			
			System.out.println();
			
		} while (!opcao.equals("0"));
		
		System.out.println("PROGRAMA ENCERRADO");
		sc.nextLine();
		sc.close();
		
	}

}
