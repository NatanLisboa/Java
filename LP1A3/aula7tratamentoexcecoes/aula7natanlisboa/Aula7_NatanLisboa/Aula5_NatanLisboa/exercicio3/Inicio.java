package Aula5_NatanLisboa.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) throws InputMismatchException, IndexOutOfBoundsException{
		
		Scanner teclado = new Scanner(System.in);
		PessoaFisica[] pessoa = new PessoaFisica[10];
		PessoaJuridica[] empresa = new PessoaJuridica[10];
		char opcao;
		int codigo = 1;
		int i = 0;
		int j = 0;
		
		System.out.print("PRESSIONE ENTER PARA INICIAR O PROGRAMA");
		
		do {
			teclado.nextLine();
			System.out.println();
			System.out.println("Aula 5 - Exerc�cio 3");
			System.out.println();
			System.out.println("1 - Inserir cliente");
			System.out.println("2 - Remover cliente");
			System.out.println("3 - Consultar clientes");
			System.out.println("0 - SAIR");
			System.out.println();
			System.out.print("Digite uma op��o: ");
			opcao = teclado.next().charAt(0);
			
			System.out.println();
			
			switch (opcao){
				case '1':
					
					char tipoClienteInsercao;
					
					do {
						
						System.out.println("1 - Pessoa f�sica");
						System.out.println("2 - Pessoa jur�dica");
						System.out.println();
						System.out.print("Qual o tipo de cliente que voc� deseja cadastrar (Insira 1 ou 2): ");
						tipoClienteInsercao = teclado.next().charAt(0);
						
						System.out.println();
						
						switch (tipoClienteInsercao) {
							case '1':
								pessoa[i] = new PessoaFisica();
								pessoa[i].setCodigo(codigo);
								System.out.print("Nome: ");
								teclado.nextLine();
								pessoa[i].setNome(teclado.nextLine());
								System.out.print("CPF: ");
								pessoa[i].setCpf(teclado.next());
								System.out.print("Endere�o: ");
								teclado.nextLine();
								pessoa[i].setEndereco(teclado.nextLine());
								System.out.print("Telefone: ");
								pessoa[i].setTelefone(teclado.next());
								System.out.println();
								System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
								i++;
								break;
							case '2':
								empresa[j] = new PessoaJuridica();
								empresa[j].setCodigo(codigo);
								System.out.print("Raz�o social: ");
								teclado.nextLine();
								empresa[j].setRazaoSocial(teclado.nextLine());
								System.out.print("CNPJ: ");
								empresa[j].setCnpj(teclado.next());
								System.out.print("Endere�o: ");
								teclado.nextLine();
								empresa[j].setEndereco(teclado.nextLine());
								System.out.print("Telefone: ");
								empresa[j].setTelefone(teclado.next());
								System.out.println();
								System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
								j++;
								break;
							default:
								System.out.println("OP��O INV�LIDA!");
								System.out.println();
						}
						
					} while ((tipoClienteInsercao != '1') && (tipoClienteInsercao != '2'));
					
					codigo++;
					
					break;
				
				case '2':
				
					char tipoClienteRemocao;
					int codigoClienteRemocao = 0;
					int k;
					
					do {
						
						System.out.println("1 - Pessoa f�sica");
						System.out.println("2 - Pessoa jur�dica");
						System.out.println();
						System.out.print("Qual o tipo de cliente que voc� deseja remover (Insira 1 ou 2): ");
						tipoClienteRemocao = teclado.next().charAt(0);
						
						switch (tipoClienteRemocao) {
							
							case '1':
								
								System.out.print("C�digo da pessoa a ser removida: ");
								try {
									codigoClienteRemocao = teclado.nextInt();
								} catch (InputMismatchException e) {
									System.out.println("Tipo inv�lido inserido!");
								}
								
								for (k = 0; k < i; k++) {
									if (pessoa[k] != null && codigoClienteRemocao == pessoa[k].getCodigo()) {
										pessoa[k] = null;
										break;
									}
								}
								
								System.out.println();
								
								if (k < i) 
								{
									i--;
									codigo--;
									System.out.println("CADASTRO REMOVIDO COM SUCESSO!");
								} else {
									System.out.println("ERRO: REGISTRO N�O ENCONTRADO!");
								}
							
								break;
								
							case '2':
								
								System.out.print("C�digo da empresa a ser removida: ");
								try {
									codigoClienteRemocao = teclado.nextInt();
								} catch (InputMismatchException e) {
									System.out.println("Tipo inv�lido inserido!");
								}
								
								for (k = 0; k < j; k++) {
									if (empresa[k] != null && codigoClienteRemocao == empresa[k].getCodigo()) {
										empresa[k] = null;
										break;
									}
								}
								
								System.out.println();
								
								if (k < j) 
								{
									j--;
									codigo--;
									System.out.println("CADASTRO REMOVIDO COM SUCESSO!");
								} else {
									System.out.println("ERRO: REGISTRO N�O ENCONTRADO!");
								}
								
								System.out.println();
								
								break;
							
							default:
								System.out.println();
								System.out.println("OP��O INV�LIDA!");
								System.out.println();
						}
					} while ((tipoClienteRemocao != '1') && (tipoClienteRemocao != '2'));
					
					break;
					
				case '3':
					
					System.out.println();
					
					if (i == 0) 
					{
						System.out.println("N�o h� pessoas f�sicas cadastradas no sistema!");
						System.out.println();
					} else {
						
						System.out.println("\t\tPESSOAS F�SICAS");
					
						for (int l = 0; l < pessoa.length; l++) {
							if (pessoa[l] != null){
								System.out.println("C�digo: " + pessoa[l].getCodigo());
								System.out.println("Nome: " + pessoa[l].getNome());
								System.out.println("CPF: " + pessoa[l].getCpf());
								System.out.println("Endere�o: " + pessoa[l].getEndereco());
								System.out.println("Telefone: " + pessoa[l].getTelefone());
								System.out.println();
							}
						}
					}
					
					if (j == 0) 
					{
						System.out.println("N�o h� pessoas jur�dicas cadastradas no sistema!");
					} else {
						System.out.println("\t\tPESSOAS JUR�DICAS");
						for (int l = 0; l < empresa.length; l++) {
							if (empresa[l] != null) {
								System.out.println("C�digo: " + empresa[l].getCodigo());
								System.out.println("Raz�o social: " + empresa[l].getRazaoSocial());
								System.out.println("CNPJ: " + empresa[l].getCnpj());
								System.out.println("Endere�o: " + empresa[l].getEndereco());
								System.out.println("Telefone: " + empresa[l].getTelefone());
								System.out.println();
							}
						}
					}
					
					break;
				
				case '0':
					break;
				
				default:
					System.out.println("OP��O INV�LIDA!");
					
			}
			
		} while (opcao != '0');
		
		teclado.close();
		
	}

}
