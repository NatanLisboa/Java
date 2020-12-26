package Aula6_NatanLisboa.exercicio4;

import java.util.Calendar;
import java.util.Date;

public class Dia extends Tempo{
	
	public Dia() {
		dataHoraInicial = Calendar.getInstance();
		dataHoraFinal = Calendar.getInstance();
	}

	public Dia(Date dataHoraInicial, Date dataHoraFinal) {
		this.dataHoraInicial.setTime(dataHoraInicial);
		this.dataHoraFinal.setTime(dataHoraFinal);
	}

	public Calendar getDataHoraInicial() {
		return dataHoraInicial;
	}

	public void setDataHoraInicial(Date dataHoraInicial) {
		this.dataHoraInicial.setTime(dataHoraInicial);
	}

	public Calendar getDataHoraFinal() {
		return dataHoraFinal;
	}

	public void setDataHoraFinal(Date dataHoraFinal) {
		this.dataHoraFinal.setTime(dataHoraFinal);
		this.calcularTempo();
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	@Override
	public void calcularTempo() {
		
		float resultadoOperacao = this.getDataHoraInicial().getTimeInMillis() - this.getDataHoraFinal().getTimeInMillis();
		resultadoOperacao /= (24 * 60 * 60 * 1000);
		this.setResultado(resultadoOperacao);
		
	}
	
	
}
