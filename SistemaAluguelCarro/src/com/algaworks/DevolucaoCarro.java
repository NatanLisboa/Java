package com.algaworks;

import com.algaworks.modelo.Aluguel;
import com.algaworks.modelo.Carro;
import com.algaworks.modelo.Cliente;

import java.time.*;

public class DevolucaoCarro {

    public static void main(String[] args) {
        Aluguel aluguel = recuperarAluguel();

        // Para cada hora de atraso, ele paga 10% do valor do carro em multa
        LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.now());
        aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
        aluguel.imprimirFatura();

    }

    public static Aluguel recuperarAluguel() {
        Cliente cliente = new Cliente("Natan da Fonseca Lisboa", LocalDate.of(2001, Month.JUNE, 21));
        Carro cruze = new Carro("Cruze", 200.0, Year.of(2013));
        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0)); //Construtor de LocalDateTime: new LocalDateTime(LocalDate, LocalTime);
        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2); // +3 dias e 2 horas contando a partir de agora

        return new Aluguel(cliente, cruze, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
    }
}
