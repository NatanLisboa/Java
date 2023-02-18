package com.fonsecaworks.classes.string;

public class ExemploClasseString9 {

	public static void main(String[] args) {
		String s = "Desesenvolvimento Java";
		
		System.out.println(s.replaceAll("Java", "de software")); // Substitui todas as ocorrências "Java" por "de software" na string em questão
		System.out.println(s.replace('o', 'p')); // Substitui todas as ocorrências do caractere 'o' por 'p' na string em questão
		System.out.println(s.replace("se", "")); // Substitui todas as ocorrências de "se" por "" na string em questão
		System.out.println(s.replaceFirst("se", "")); // Substitui a primeira ocorrência de "se" por "" na string em questão
	}

}
