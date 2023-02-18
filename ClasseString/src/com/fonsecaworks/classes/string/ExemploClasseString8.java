package com.fonsecaworks.classes.string;

public class ExemploClasseString8 {

	public static void main(String[] args) {
		String s = "Java";
		int indice = s.indexOf("a"); //Pega o índice da primeira ocorrência da letra "a". Retorna -1 caso a string procurada não seja encontrada.

		System.out.println(indice); //1
		
		indice = s.lastIndexOf("a"); //Pega o índice da última ocorrência da letra "a". Retorna -1 caso a string procurada não seja encontrada.
		
		System.out.println(indice); //3
		
	}

}
