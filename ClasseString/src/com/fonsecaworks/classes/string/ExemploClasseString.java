package com.fonsecaworks.classes.string;

public class ExemploClasseString {

	public static void main(String[] args) {
		String nome = "Pedro";
		System.out.println(nome.toUpperCase()); /* Tudo com letras maiúsculas */
		System.out.println(nome);
	
		//-------------------------------------------
		
		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println("s1 == s2? " + (s1 == s2)); //true
		
		String s3 = new String("Pedro");
		System.out.println("s3 == s1? " + (s3 == s1)); //false
		
		//O operador == compara o endereço de memória que as instâncias estão apontando, não o conteúdo da String. Por isso, NÃO É RECOMENDADO COMPARAR STRINGS COM ==.
		
		System.out.println("s1.equals(s2)? " + s1.equals(s2)); //string.equals(anotherString): Maneira correta de comparar o conteúdo das strings.
		System.out.println("s1.equals(s2)? " + s3.equals(s1));

		String s4 = "PeDrO";
		System.out.println("s1.equals(s4)? " + s1.equals(s4)); //false
		System.out.println("s1.equalsIgnoreCase(s4)? " + s1.equalsIgnoreCase(s4)); //true
		
	}

}
