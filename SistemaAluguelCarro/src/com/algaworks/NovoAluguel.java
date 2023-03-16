package com.algaworks;

import com.algaworks.modelo.Aluguel;
import com.algaworks.modelo.Carro;
import com.algaworks.modelo.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Natan da Fonseca Lisboa", LocalDate.of(2001, Month.JUNE, 21));
        Carro cruze = new Carro("Cruze", 200.0, Year.of(2013));
        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0)); //"Construtor" de LocalDateTime: LocalDateTime.of(LocalDate, LocalTime);
        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2); // +3 dias e 2 horas contando a partir de agora

        Aluguel aluguel = new Aluguel(cliente, cruze, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);

        System.out.println(">>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
        System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaDaDevolucao().format(formatter));
    }

}
