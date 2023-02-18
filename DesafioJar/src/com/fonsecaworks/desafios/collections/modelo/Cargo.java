package com.fonsecaworks.desafios.collections.modelo;

import java.math.BigDecimal;

/**
 * Classe que representa o cargo de um parlamentar
 * @author Natan da Fonseca Lisboa
 */
public class Cargo {

	/**
	 * Descrição do cargo político (Ex.: Prefeito)
	 */
	private String descricao;
	
	/**
	 * Salário correspondente ao cargo político
	 */	
	private BigDecimal salario;
	
	/**
	 * Construtor da classe Cargo. Retorna uma instância do tipo Cargo
	 */
	public Cargo() {
		
	}
	
	/**
	 * Método para obter a descrição do cargo político
	 * @return Descrição do cargo político (Ex.: Vereador)
	 */
	public String getDescricao() {
		return this.descricao;
	}
	
	/**
	 * Método para atribuir a descrição a um objeto do tipo Cargo 
	 * @param descricao Descrição do cargo político (Ex.: Vereador)
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Método para obter o salário do cargo político
	 * @return Salário do cargo político
	 */
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	/**
	 * Método para atribuir o salário a um objeto do tipo Cargo
	 * @param salario Salário do cargo político
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
