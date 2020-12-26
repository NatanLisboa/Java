package Aula9_NatanLisboa.exercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
	
	public static boolean criarDiretorio(File dir) throws IOException {
		
		return dir.mkdir();
		
	}	
	
	public static boolean criarArquivoEEscrever(File arquivo, String nomeArquivo, String caminhoArquivo, String conteudoArquivo, char modoEscritaArquivo) {
		
		boolean exito;
		String conteudoExistenteArquivo = new String();
		String s;
		
		try {
			
			if (!arquivo.exists()) {
				arquivo.createNewFile();
			}
				
			FileReader fr = new FileReader(arquivo.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
	
			while ((s = br.readLine()) != null) {
				conteudoExistenteArquivo += (s + "\n");
			}
			
			FileWriter fw = new FileWriter(arquivo.getAbsolutePath());
			BufferedWriter bw = new BufferedWriter(fw);
			
			if (modoEscritaArquivo == '1')
				bw.write(conteudoArquivo);
			else {
				bw.write(conteudoExistenteArquivo);
				bw.append(conteudoArquivo);
			}
			
			bw.close();
			
			exito = true;
			
		} catch (IOException e) {
			exito = false;
		}
		
		return exito;
		
	}
	
	public static void lerArquivo(File arquivo) {
		
		try {
		
			FileReader fr = new FileReader(arquivo.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			String linha;
			
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			
		} catch (FileNotFoundException e1) {
			System.out.println("O arquivo especificado não foi encontrado!");
		} catch (IOException e2) {
			System.out.println("Erro ao tentar ler o arquivo especificado! Verifique o caminho especificado e suas permissões de usuário e tente novamente.");
		}
		
	}
	
	public static void lerArquivo(File arquivo, int linhaInicial, int linhaFinal) {
		
		try {
					
			FileReader fr = new FileReader(arquivo.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			ArrayList<String> lista = new ArrayList<>();
			String s = new String();
			
			while ((s = br.readLine()) != null) {
				lista.add(s);
			}
				
			for (int i = linhaInicial - 1; i <= linhaFinal - 1; i++) {
				System.out.println(lista.get(i));
			}
			
		} catch (FileNotFoundException e1) {
			System.out.println("O arquivo especificado não foi encontrado!");
		} catch (IOException e2) {
			System.out.println("Erro ao tentar ler o arquivo especificado! Verifique o caminho especificado e suas permissões de usuário e tente novamente.");
		}
		
	}
	
	public static void exibirInformacoes(File arq) {
		
		if (arq.exists()) {
			
			if (arq.isFile()) {
				
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(arq.lastModified());
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
			
			System.out.println("Última Modificação: " + dataHora);
			System.out.println("Caminho: " + arq.getPath());
			System.out.println("Diretório Pai: " + arq.getParent());
			System.out.println("Tamanho: " + arq.length() + " bytes");
			
			} else if (arq.isDirectory()) {
				
				Calendar cal = Calendar.getInstance();
				cal.setTimeInMillis(arq.lastModified());
				String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(cal.getTime());
				
				System.out.println("Última Modificação: " + dataHora);
				System.out.println("Caminho: " + arq.getPath());
				System.out.println("Diretório Pai: " + arq.getParent());
				
			}
			
		} else {
			System.out.println("Não foi possível encontrar o arquivo especificado! Tente novamente.");
		}
		
	}
	
	public static void exibirConteudoDiretorio(File dir) {
		
		if (dir.exists()) {
			
			for (File arq : dir.listFiles()) {
				System.out.println(arq);
			}
			
		} else {
			System.out.println("Não foi possível encontrar o diretório especificado");
		}
		
	}

}
