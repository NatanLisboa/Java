package Aula2_NatanLisboa;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		do {
			System.out.println("Exercício 2");
			System.out.print("Digite um ano (entre 0 e 9999): ");
			ano = sc.nextInt();
			System.out.println("");
			if ((ano < 0) || (ano > 9999))
				System.out.println("Digite um ano entre 0 e 9999!!!");
			System.out.println("");
		} while ((ano < 0) || (ano > 9999));
		
		if (ano % 4 == 0) {
			if (!(ano % 100 == 0)) {
				System.out.println("O ano " + ano + " é bissexto");
			}
			else{
				if (ano % 400 == 0) {
					System.out.println("O ano " + ano + " é bissexto");
				}
				else {
					System.out.println("O ano " + ano + " não é bissexto");
				}
			}
		}
		else {
			System.out.println("O ano " + ano + " não é bissexto");
		}

		sc.close();
	}

}
