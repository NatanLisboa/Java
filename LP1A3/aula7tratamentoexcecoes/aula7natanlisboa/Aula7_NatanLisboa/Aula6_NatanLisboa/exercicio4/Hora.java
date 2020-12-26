package Aula6_NatanLisboa.exercicio4;

import java.util.Calendar;
import java.util.Date;

public class Hora extends Tempo{
	
	public Hora() {
		dataHoraInicial = Calendar.getInstance();
		dataHoraFinal = Calendar.getInstance();
	}
	
	public Hora(Calendar dataHoraInicial, Calendar dataHoraFinal) {
		this.dataHoraInicial = dataHoraInicial;
		this.dataHoraFinal = dataHoraFinal;
		this.calcularTempo();
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

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	@Override
	public void calcularTempo() {
		
		float resultadoOperacao = this.getDataHoraInicial().getTimeInMillis() - this.getDataHoraFinal().getTimeInMillis();
		resultadoOperacao /= (60 * 60 * 1000);
		this.setResultado(resultadoOperacao);
		
	}
	
}
