package com.fonsecaworks.classes.string;

public class ExemploClasseString5 {

	public static void main(String[] args) {
		//public String substring(int beginIndex) //Pega do beginIndex até o final
		//public String substring(int beginIndex, int endIndex) Pega do beginIndex até endIndex - 1 
		
		String s = "Desenvolvimento Java";
		System.out.println(s.substring(16)); //Java
		
		String s2 = "Cursos online de desenvolvimento de software";
		System.out.println(s2.substring(7, 12)); //onlin
		
	}

}
