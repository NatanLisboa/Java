package Aula5_NatanLisboa.exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setIdConta(0);
		conta.setAgencia(1111);
		conta.setNumeroConta("111111111");
		conta.setTitular("Natan", "12345678901", "Rua dos Bobos nº 0", "natan.lisboa1@hotmail.com");
		
		conta.getDadosConta();
		
		System.out.println();
		
		conta = new Conta();
		
		conta.setIdConta(1);
		conta.setAgencia(2222);
		conta.setNumeroConta("222222222");
		conta.setTitular("Maria", "98765432109", "Rua das Laranjeiras nº 25", "maria.silva12@gmail.com");
		
		conta.getDadosConta();

	}

}
