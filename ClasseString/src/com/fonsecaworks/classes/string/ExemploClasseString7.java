package com.fonsecaworks.classes.string;

public class ExemploClasseString7 {

	public static void main(String[] args) {
		String s = "Cursos_online_de_desenvolvimento_de_software";
		
		String[] array = s.split("_"); //Quebra a string, separando cada String pelo delimitador _ e devolvendo as strings separadas em um array de String
		//( Ex.: Cursos_online_de_desenvolvimento_de_software -> ["Cursos", "online", "de", "desenvolvimento", "de", "software"]   
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
		}
	}

}
