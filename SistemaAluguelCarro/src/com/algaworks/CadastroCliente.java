package com.algaworks;

import com.algaworks.modelo.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class CadastroCliente {

    public static void main(String[] args) {
        /* JDK 7 - Criar instância de java.util.Date */

        /*Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1980);
        c.set(Calendar.MONTH, 8);
        Date dataNascimento = c.getTime();

        Cliente cliente = new Cliente("João Silva", dataNascimento);

         */

        /* JDK 8+ - Criar instância de java.time.LocalDate */
        Cliente cliente = new Cliente("Natan da Fonseca Lisboa", LocalDate.of(2001, Month.JUNE, 21));

        /*----------------------------------------------------------------------------------------------------------*/

        /* JDK 7 - Calcular diferença entre datas */
//        Calendar hoje = Calendar.getInstance();
//        Calendar idade = Calendar.getInstance();
//        idade.set(Calendar.YEAR, 2001);
//        idade.set(Calendar.MONTH, Calendar.JUNE);
//        idade.set(Calendar.DAY_OF_MONTH, 21);
//
//        long diferencaEmMilisegundos = hoje.getTimeInMillis() - idade.getTimeInMillis();
//        long idadeEmAnos = diferencaEmMilisegundos / 1000 / 60 / 60 / 24 / 365;
//        System.out.println(idadeEmAnos);

        /* JDK 8+ - Calcular diferença entre datas */
        int idadeEmAnos = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

        if (idadeEmAnos < 18) {
            System.err.println("Idade de " + cliente.getNome() + " insuficiente para cadastro: " + idadeEmAnos + " anos.");
        } else {
            System.out.println("Usuário " + cliente.getNome() + " pode ser cadastrado no sistema: " + idadeEmAnos + " anos.");
        }
    }

}
