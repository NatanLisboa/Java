package Aula5_NatanLisboa.exercicio1;

public class Conta {
	
	private int idConta;
	private int agencia;
	private String numeroConta;
	private Cliente titular;
	
	public Conta() {
		this.titular = new Cliente();
	}

	public void getDadosConta() {
		System.out.println("Id da conta: " + this.idConta);
		System.out.println("Número da agência: " + this.agencia);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Dados do cliente: ");
		this.titular.getDadosCliente();
	}
	
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
		
	public void setTitular(String nome, String cpf, String endereco, String email) {
		
		this.titular.setNome(nome);
		this.titular.setCpf(cpf);
		this.titular.setEndereco(endereco);
		this.titular.setEmail(email);
	
	}
	
	
	
}
