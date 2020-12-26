package Aula5_NatanLisboa.exercicio3;

public class PessoaFisica extends Cliente {
	
	private String nome;
	private String cpf;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(int codigo, String endereco, String telefone, String nome, String cpf) {
		super(codigo, endereco, telefone);
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
