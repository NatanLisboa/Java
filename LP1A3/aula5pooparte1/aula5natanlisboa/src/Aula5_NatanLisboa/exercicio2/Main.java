package Aula5_NatanLisboa.exercicio2;

public class Main {

	public static void main(String[] args) {
		
		Computador computador = new Computador();
		
		computador.setModelo("CCE WIN BPS");
		computador.setGabinete("Não há");
		computador.setMouse("Mouse óptico");
		computador.setTeclado("Teclado padrão ABNT2");
		computador.setMonitor("Tela 14.0\" CCE WXGA HD 1366x768");
		computador.setRam(2);
		computador.setProcessador("Intel Pentium", 2.3, 2, 1, 65);
		computador.getDadosComputador();
		
	}
	
}
