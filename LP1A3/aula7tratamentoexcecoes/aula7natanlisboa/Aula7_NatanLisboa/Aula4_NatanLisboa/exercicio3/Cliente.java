package Aula4_NatanLisboa.exercicio3;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String cpf;
	
	public Cliente() {
		
	}

	public Cliente(int codigo, String nome, String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public boolean setNome(String nome) {
		
		if (nome.indexOf(" ") < (nome.length())){
			this.nome = nome;
			return true;
		} else {
			return false;
		}
		
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		
		if(cpf.length() == 11) {
			this.cpf = cpf;
			return true;
		} else {
			return false;
		}
	}
	
}
