package Aula5_NatanLisboa.exercicio1;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}

	public void getDadosCliente() {
		System.out.println("  Nome: " + this.nome);
		System.out.println("  CPF: " + this.cpf);
		System.out.println("  Endereço: " + this.endereco);
		System.out.println("  E-mail: " + this.email);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
