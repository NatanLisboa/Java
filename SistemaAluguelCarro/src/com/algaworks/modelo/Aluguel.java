package com.algaworks.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

    private Cliente cliente;
    private Carro carro;

    private LocalDateTime dataEHoraDaRetirada; /* LocalDateTime: JDK 8+ */
    private LocalDateTime dataEHoraPrevistaDaDevolucao; /* LocalDateTime: JDK 8+ */

    private LocalDateTime dataEHoraRealDaDevolucao; /* LocalDateTime: JDK 8+ */
    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada, LocalDateTime dataEHoraPrevistaDaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
        this.dataEHoraPrevistaDaDevolucao = dataEHoraPrevistaDaDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDateTime getDataEHoraDaRetirada() {
        return dataEHoraDaRetirada;
    }

    public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
    }

    public LocalDateTime getDataEHoraPrevistaDaDevolucao() {
        return dataEHoraPrevistaDaDevolucao;
    }

    public void setDataEHoraPrevistaDaDevolucao(LocalDateTime dataEHoraPrevistaDaDevolucao) {
        this.dataEHoraPrevistaDaDevolucao = dataEHoraPrevistaDaDevolucao;
    }

    public LocalDateTime getDataEHoraRealDaDevolucao() {
        return dataEHoraRealDaDevolucao;
    }

    public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
        this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
    }

    public void imprimirFatura() {
        Duration duration = Duration.between(dataEHoraPrevistaDaDevolucao, dataEHoraRealDaDevolucao); /* (JDK 8+) durationObject.between(LocalDateTime from, LocalDateTime to): Diferença entre um período e outro */
        double multa = duration.toHours() * carro.getValorDiaria() * 0.1;

        if (!duration.isNegative() && !duration.isZero()) {
            System.out.println(">>>>>>>>>>>>> Fatura <<<<<<<<<<<<<<");
            System.out.printf("Valor da multa: R$%.2f. Você atrasou %d horas", multa, duration.toHours());
        } else {
            System.out.println("Agradecemos pela pontualidade na devolução");
        }

    }
}
