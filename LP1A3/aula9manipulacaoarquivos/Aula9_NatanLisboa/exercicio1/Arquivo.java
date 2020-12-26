package Aula9_NatanLisboa.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Arquivo {

	public static boolean criarArquivo(File arq) {
		
		try {
			return arq.createNewFile();
		} catch (IOException e) {
			return false;
		}
		
	}
	
	public static boolean deletarArquivo(File arq) throws FileNotFoundException, IOException {
		
		return arq.delete();
		
	}
	
	public static boolean renomearArquivo(String caminhoArquivo, File arquivoAntigo, String novoNomeArquivo) throws IOException {
		
		File arquivoRenomeado = new File(caminhoArquivo + "\\" + novoNomeArquivo);
		
		return arquivoAntigo.renameTo(arquivoRenomeado);
		
	}
	
	public static boolean moverArquivo(File arquivo, String novoCaminhoArquivo, String nomeArquivo) throws IOException {
		
		File arquivoMovido = new File(novoCaminhoArquivo + "\\" + nomeArquivo);
		
		return arquivo.renameTo(arquivoMovido);
		
	}
	
	
}
