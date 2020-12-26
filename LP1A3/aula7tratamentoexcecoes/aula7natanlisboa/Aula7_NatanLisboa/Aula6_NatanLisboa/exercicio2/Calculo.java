package Aula6_NatanLisboa.exercicio2;

public class Calculo {
	
	public static double executarCalculo(double num){
		return java.lang.Math.sqrt(num);
	}
	
	public static double executarCalculo(double base, double expoente){
		return java.lang.Math.pow(base, expoente);
	}
	
	public static int executarCalculo(int num) {
		
		int fatorial = 1;
		
		for (int i = num; i > 0; i--) {
			
			fatorial *= i;
			if (i >= 2) {
				System.out.print(i + " x ");
			}
			else {
				System.out.print(i + " = ");
			}
		}
		
		return fatorial;
		
	}
	
}
