package Aula2_NatanLisboa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Exerc�cio 1");
		System.out.print("Digite um n�mero inteiro: ");
		num = sc.nextInt();
		
		System.out.println("");
		System.out.print("O n�mero " + num + " � ");
		
		if (num % 2 == 0) 
			System.out.println("par");
		else
			System.out.println("�mpar");
		
		sc.close();
	}

}
