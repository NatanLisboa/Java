package exercicio3;

public class PesquisaInicio extends Pesquisa{
	
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		
		boolean stringPresenteTexto = texto.toLowerCase().startsWith(cadeiaCaracteres.toLowerCase());
		
		return stringPresenteTexto;
		
	}
}
