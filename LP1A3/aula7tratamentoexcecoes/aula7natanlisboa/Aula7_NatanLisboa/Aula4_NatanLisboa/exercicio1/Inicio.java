package Aula4_NatanLisboa.exercicio1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		System.out.println("Aula 4 - Exercício 1");
		
		NumberFormat formatoMoedaBrasileira = NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();	
		
		formatoMoedaBrasileira.setCurrency(Currency.getInstance("BRL"));
		System.out.println();
		System.out.print("Insira o código do produto: ");
		
		try {
			p.setCodigo(sc.nextInt());
		} catch (InputMismatchException e){
			extracted();
		} finally {
			System.out.println("PROCESSANDO...");
			try { 
				Thread.sleep (1000); 
			} catch (InterruptedException ex) {
				System.out.println("O usuário decidiu encerrar o programa! PROGRAMA ENCERRADO!");
			}
			
		}
		
		System.out.print("Insira a descrição do produto: ");
		sc.nextLine();
		p.setDescricao(sc.nextLine());
		System.out.println("PROCESSANDO...");
		
		try {
			Thread.sleep (1000);
		} catch (InterruptedException ex) {
			System.out.println("O usuário decidiu encerrar o programa! PROGRAMA ENCERRADO!");
		}
		
		System.out.print("Insira o preço do produto (em R$): R$");
		try {
			p.setPreco(sc.nextFloat());
		} catch (InputMismatchException e){
			extracted();
		} finally {
			System.out.println("PROCESSANDO...");
			try { 
				Thread.sleep (1000); 
			} catch (InterruptedException ex) {
				System.out.println("O usuário decidiu encerrar o programa! PROGRAMA ENCERRADO!");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("false - Inativo");
		System.out.println("true - Ativo");
		System.out.println();
		System.out.print("Insira o estado do produto: ");
		try {
			p.setAtivo(sc.nextBoolean());
		} catch (InputMismatchException e){
			extracted();
		} finally {
			System.out.println("PROCESSANDO...");
			try { 
				Thread.sleep (1000); 
			} catch (InterruptedException ex) {
				System.out.println("O usuário decidiu encerrar o programa! PROGRAMA ENCERRADO!");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Código do produto: " + p.getCodigo());
		System.out.println("Descrição do produto: " + p.getDescricao());
		System.out.println("Preço do produto: " + formatoMoedaBrasileira.format(p.getPreco()));
		System.out.print("Estado do produto: ");
		if (p.isAtivo()){
			System.out.print("Ativo");
		} else {
			System.out.print("Inativo");
		}
		
		System.out.println();
		
		sc.close();
		
	}
	
	private static void extracted() {
		throw new InputMismatchException("Tipo de dado incorreto inserido!");
	}
	
}
