package Aula2_NatanLisboa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Exercício 1");
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		System.out.println("");
		System.out.print("O número " + num + " é ");
		
		if (num % 2 == 0) 
			System.out.println("par");
		else
			System.out.println("ímpar");
		
		sc.close();
	}

}
