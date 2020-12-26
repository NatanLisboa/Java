package Aula4_NatanLisboa.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cliente[] c = new Cliente[10];
		char opcao = '0';
		
		do{
			
			for (int i=1; i<=c.length; i++){
				try {
					c[i-1] = new Cliente();
					c[i-1].setCodigo(i);
				} catch (IndexOutOfBoundsException | NullPointerException exceptionVetor){
					extracted();
				}
				System.out.println();
				System.out.println("Aula 4 - Exercício 3");
				System.out.println("Sistema para cadastro de clientes");
				System.out.println();
				System.out.println("1 - Inserir cliente");
				System.out.println("2 - Consultar cliente específico");
				System.out.println("3 - Consultar clientes");
				System.out.println("0 - SAIR");
				System.out.println();
				System.out.print("Selecione a opção desejada: ");
				opcao = sc.next().charAt(0);
			
				sc.nextLine();
				System.out.println();
				
				switch (opcao){
					
				case '1':
												
						while (true) {
							
							boolean dadoValido = false;
							
							System.out.print("Nome completo do cliente: ");
							dadoValido = (c[(c[i-1].getCodigo() - 1)].setNome(sc.nextLine()));
							
							if (dadoValido){
								break;
							} else {
								System.out.println("Não foi informado nome do meio ou sobrenome");
							}
							
						}
						
						while (true) {
							
							System.out.print("CPF do cliente: ");
							if ((c[(c[i-1].getCodigo() - 1)].setCpf(sc.next())) == false){
								System.out.println("O CPF informado não possui 11 digitos");
							} else {
								System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
								
								break;
							}
						}
						
						break;
						
					case '2':
						
						int codigoInserido = 0;
						int j;
						
						while (true) {
							
							System.out.print("Insira o código do cliente: ");
							try {
								codigoInserido = sc.nextInt(); 
								break;
							} catch (InputMismatchException e){
								System.out.println();
								System.out.println("Tipo de dado inválido inserido!");
								System.out.println();
								sc.nextLine();
							}
							
						}
						
						if (codigoInserido <= 0) {
							System.out.println("O sistema não possui clientes cadastrados com número menor ou igual a zero! Por favor, tente novamente.");
						} else {
							
							for (j=0; j<c[i-1].getCodigo() - 1; j++){
								if (codigoInserido == c[j].getCodigo()){
									System.out.println("Nome do cliente: " + c[j].getNome());
									System.out.println("CPF do cliente: " + c[j].getCpf());
									break;
								} else if (j == c[i-1].getCodigo() - 2){
									System.out.println("Não foram encontrados clientes cadastrados com o código informado");
								}
							}
							
						}
						
						i = (c[i-1].getCodigo() - 1);
						
						break;
					
					case '3':
					
						for (int k=0; k<c[i-1].getCodigo() - 1; k++){
							System.out.println("Código do cliente: " + c[k].getCodigo());
							System.out.println("Nome do cliente: " + c[k].getNome());
							System.out.println("CPF do cliente: " + c[k].getCpf());
							System.out.println();
						}
						
						i = (c[i-1].getCodigo() - 1);
						
						break;
						
					case '0':
						
						break;
						
					default:
						
						System.out.println("Opção inválida");
						
				}		
			
				if (opcao == '0') {
					break;
				}
				
			}
		
			
		} while (opcao != '0');
		
		sc.close();
	}
	
	private static void extracted() {
		throw new NullPointerException("Houve um problema com a colocação de dados no vetor");
	}

}
