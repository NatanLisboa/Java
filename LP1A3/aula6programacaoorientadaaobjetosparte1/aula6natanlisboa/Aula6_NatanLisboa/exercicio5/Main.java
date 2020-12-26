package exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner teclado = new Scanner(System.in);
		char opcao;
		Date dataHoraInicial = new Date();
		Date dataHoraFinal = new Date();
		
		System.out.print("PRESSIONE ENTER PARA INICIAR O PROGRAMA");
		
		do {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
			Dia calculoEmDias = new Dia();
			Hora calculoEmHoras = new Hora();
			
			teclado.nextLine();
			System.out.println();
			System.out.print("Digite uma data e hora inicial (dd/mm/yy hh:mm): ");
			dataHoraInicial = (sdf.parse(teclado.nextLine()));
			System.out.print("Digite uma data e hora final (dd/mm/yy hh:mm): ");
			dataHoraFinal = (sdf.parse(teclado.nextLine()));
			System.out.println();
			System.out.println("1 - Calcular dias");
			System.out.println("2 - Calcular horas");
			System.out.println("0 - SAIR");
			System.out.println();
			
			System.out.print("Digite uma opção (Número entre 0 e 2): ");
			opcao = teclado.next().charAt(0);
			
			switch(opcao) {
				case '1':
					calculoEmDias.setDataHoraInicial(dataHoraInicial);
					calculoEmDias.setDataHoraFinal(dataHoraFinal);
					System.out.println();
					System.out.println((sdf.format(dataHoraInicial)) + " - " + sdf.format(dataHoraFinal) + " = " + calculoEmDias.getResultado() + " dias");
					break;
				case '2':
					calculoEmHoras.setDataHoraInicial(dataHoraInicial);
					calculoEmHoras.setDataHoraFinal(dataHoraFinal);
					System.out.println();
					System.out.println((sdf.format(dataHoraInicial)) + " - " + sdf.format(dataHoraFinal) + " = " + calculoEmHoras.getResultado() + " horas");
					break;
				case '0':
					break;
				default:
					System.out.println("Opção inválida! Por favor, digite uma opção entre 0 e 2");
			}
			
		} while (opcao != '0');
		
		teclado.close();
		
	}

}
