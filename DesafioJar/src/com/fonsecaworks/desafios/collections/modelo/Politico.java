package com.fonsecaworks.desafios.collections.modelo;

/**
 * Classe que representa um político, contendo os atributos nome e cargo
 * @author Natan da Fonseca Lisboa
 */
public class Politico {

	/**
	 * Nome do político
	 */
	private String nome;
	
	/**
	 * Cargo ocupado pelo político
	 */
	private Cargo cargo;
	
	
	/**
	 * Retorna o nome do político
	 * @return Nome do político
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Atribui o atributo nome a um político
	 * @param nome Nome que será atribuido a um objeto do tipo Politico
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o cargo do político
	 * @return Cargo do político
	 */
	public Cargo getCargo() {
		return this.cargo;
	}
	
	/**
	 * Atribui o atributo cargo a um político
	 * @param cargo Cargo que será atribuido a um objeto do tipo Politico
	 */	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}