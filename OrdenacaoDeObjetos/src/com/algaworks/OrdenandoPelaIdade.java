package com.algaworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 22);
		Pessoa p2 = new Pessoa("Adriana", 23);
		Pessoa p3 = new Pessoa("Bruno", 21);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		IdadeComparator comparadorPorIdade = new IdadeComparator();
		//Collections.sort(pessoas, comparadorPorIdade); /* Collections.sort(lista de objeto que implementa a interface Comparable<T>, comparador (Classe que implementa Comparator<T>)) */
		pessoas.sort(comparadorPorIdade); /* Java 8+: objeto.sort(Comparator<T>). Não é mais necessário que a classe implemente Comparable<T> */
		
		/* Classes que implementam a interface Comparable<T> x Classes que implementam a interface Comparator<T> */
		/* Comparable: Classes que terão um objeto comparável a outro por meio do método compareTo (o1.compareTo(o2)) */
		/* Comparator: Classes que terão um objeto comparador, que comparará dois objetos da mesma classe por meio do método compare (compare(o1, o2)) */
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
