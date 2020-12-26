package Aula6_NatanLisboa.exercicio4;

import java.util.Calendar;

public abstract class Tempo {
	
	protected Calendar dataHoraInicial;
	protected Calendar dataHoraFinal;
	protected float resultado;

	public abstract void calcularTempo();
	
}
