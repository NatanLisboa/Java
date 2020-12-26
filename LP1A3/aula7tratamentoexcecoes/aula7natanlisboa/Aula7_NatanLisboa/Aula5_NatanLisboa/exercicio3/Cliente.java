package Aula5_NatanLisboa.exercicio3;

public class Cliente {
	
	private int codigo;
	private String endereco;
	private String telefone;
	
	public Cliente() {
		
	}

	public Cliente(int codigo, String endereco, String telefone) {
		this.codigo = codigo;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	protected int getCodigo() {
		return codigo;
	}
	
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	protected String getEndereco() {
		return endereco;
	}
	
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	protected String getTelefone() {
		return telefone;
	}
	
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
