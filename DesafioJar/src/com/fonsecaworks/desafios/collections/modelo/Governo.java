package com.fonsecaworks.desafios.collections.modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

/**
 * Classe que representa o governo de uma nação, sendo responsável por adicionar políticos dentro de um partido e calcular gastos de parlamentares por partido político e por cargo ocupado
 * @author Natan da Fonseca Lisboa
 */
public class Governo {

	/**
	 * Armazena uma lista de políticos por estado da federação
	 */
	private Map<String, List<Politico>> partidosPoliticos;

	/**
	 * Construtor da classe Governo. Inicializa o atributo partidosPoliticos da classe Governo e retorna uma instância do tipo Governo
	 */
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	/**
	 * Método que adiciona um político no atributo partidosPoliticos de um objeto da classe Governo
	 * @param partidoPolitico Partido político do parlamentar que será adicionado
	 * @param politico Político que será adicionado
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);
		
		// adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
		

	/**
	 * Método que calcula gastos com salários de parlamentares, separando os gastos por partido político
	 * @param partidoPolitico Partido político dos parlamentares que terão seus gastos calculados
	 * @return Valor de gastos com os parlamentares do partido político passado como argumento
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicosPartido = this.partidosPoliticos.get(partidoPolitico);
		
		// calcula os gastos com salário para os políticos do partido informado
		BigDecimal gastosComSalario = BigDecimal.ZERO;
		for (Politico politico : politicosPartido) {
			gastosComSalario = gastosComSalario.add(politico.getCargo().getSalario());
		}
		
		return gastosComSalario;
	}
	
	/**
	 * Método que calcula gastos com salários de parlamentares, separando os gastos por cargo e partido político
	 * @param cargo Cargo político a ser levado em consideração para efetuar o cálculo de gastos
	 * @param partidoPolitico Partido político dos parlamentares que terão seus gastos calculados
	 * @return Valor de gastos com os parlamentares do cargo X do partido político Y passado como argumento
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// recupera a lista de políticos para um partido 
		List<Politico> politicosPartido = this.partidosPoliticos.get(partidoPolitico);
		
		// calcula os gastos com salário para os políticos do partido informado, caso o cargo corresponda ao que foi enviado como argumento
		BigDecimal gastosComSalarioParaCargo = BigDecimal.ZERO;
		for (Politico politico : politicosPartido) {
			if (cargo.equals(politico.getCargo())) {
				gastosComSalarioParaCargo = gastosComSalarioParaCargo.add(politico.getCargo().getSalario());
			}
		}
		
		return gastosComSalarioParaCargo;
	}

}
