package exercicio3;

public class Pesquisa {
	
	protected static String texto;

	protected Pesquisa() {
		
	}

	protected String getTexto() {
		return texto;
	}
	
	protected boolean buscarString(String cadeiaCaracteres) {
		
		boolean stringPresenteTexto = false;
		
		if (texto.toLowerCase().contains(cadeiaCaracteres.toLowerCase())){
			stringPresenteTexto = true;
		}
		
		return stringPresenteTexto;
	}
	
}
