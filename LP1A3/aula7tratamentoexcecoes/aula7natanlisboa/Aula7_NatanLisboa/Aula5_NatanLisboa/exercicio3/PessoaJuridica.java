package Aula5_NatanLisboa.exercicio3;

public class PessoaJuridica extends Cliente {
	
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(int codigo, String endereco, String telefone, String razaoSocial, String cnpj) {
		super(codigo, endereco, telefone);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
