package exercicio3;

public class PesquisaFim extends Pesquisa{
	
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {	
		
		boolean stringPresenteTexto = texto.toLowerCase().endsWith(cadeiaCaracteres.toLowerCase());
		
		return stringPresenteTexto;
		
	}
}
