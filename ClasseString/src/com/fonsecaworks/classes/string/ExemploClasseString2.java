package com.fonsecaworks.classes.string;

public class ExemploClasseString2 {

	public static void main(String[] args) {
		String s = "ALGAWORKS";
		
		System.out.println(s.charAt(0)); //A
		System.out.println(s.charAt(2)); //G
		System.out.println(s.charAt(8)); //S
		System.out.println(s.charAt(9)); //exceção: java.lang.StringIndexOutOfBoundsException
		
	}

}
