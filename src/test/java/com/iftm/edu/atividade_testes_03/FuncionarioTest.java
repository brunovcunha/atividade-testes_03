package com.iftm.edu.atividade_testes_03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    private Funcionario funcionario;

    @Test
    public void testarConstrutorPagamentoInvalido() {
        String nome = "Bruno";
        int horasTrabalhadas = 10;
        double valorHora = 3.0;

    }

    @Test
    public void testarConstrutorEntradaValorHoraInvalida() {

        String nome = "Bruno";
        int horasTrabalhadas = 40;
        double valorHora = 600.0;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        });
    }

    @Test
    public void testarConstrutorEntradaHorasInvalida() {

        String nome = "Bruno";
        int horasTrabalhadas = 45;
        double valorHora = 60;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        });
    }

    @Test
    public void testarConstrutorEntradasValida() {
        String nome = "Bruno";
        int horasTrabalhadas = 35;
        double valorHora = 60.0;

        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        assertEquals(nome, funcionario.getNome());
        assertEquals(horasTrabalhadas, funcionario.getHorasTrabalhadas());
        assertEquals(valorHora, funcionario.getValorHora());

    }

    @Test
    public void testarModificarHorasPagamentoInvalido() {
        String nome = "Joao";
        int horasTrabalhadas = 40;
        double valorHoraValida = 60.0;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHoraValida);

        double valorHoraInvalida = 1.0;
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setValorHora(valorHoraInvalida);
        });
    }

    @Test
    public void testarModificarHorasEntradaInvalida() {
        String nome = "Joao";
        int horasTrabalhadasValida = 20;
        double valorHora = 66.0;
        funcionario = new Funcionario(nome, horasTrabalhadasValida, valorHora);

        int horasTrabalhadasInvalida = 50;
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setHorasTrabalhadas(horasTrabalhadasInvalida);
        });
    }

    @Test
    public void testarModificarHorasEntradaValida() {
        String nome = "Joao";
        int horasTrabalhadas = 20;
        double valorHora = 70.0;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        int horasTrabalhadasModificada = 30;
        funcionario.setHorasTrabalhadas(horasTrabalhadasModificada);
        int resultadoObtido = funcionario.getHorasTrabalhadas();
        assertEquals(horasTrabalhadasModificada, resultadoObtido);
    }

    @Test
    public void testarModificarHorasPagamentoValido() {
        String nome = "Joao";
        int horasTrabalhadas = 40;
        double valorHoraValida = 60.0;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHoraValida);

        double resultadoObtido = funcionario.getValorHora();
        assertEquals(valorHoraValida, resultadoObtido);
    }
    
    @Test
    public void testarModificarValorPagamentoInvalido() {
        String nome = "Vinicius";
        int horasTrabalhadas = 35;
        double valorHoraValida = 50.0;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHoraValida);

        double valorHoraInvalida = -10.0;
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setValorHora(valorHoraInvalida);
        });
    }

    @Test
    public void testarModificarValorEntradaInvalida() {
        String nome = "Vinicius";
        int horasTrabalhadas = 30;
        double valorHoraValida = 66;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHoraValida);

        double valorHoraInvalida = 1000.0;
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setValorHora(valorHoraInvalida);
        });
    }

    @Test
    public void testarModificarValorEntradaValida() {
        String nome = "Vinicius";
        int horasTrabalhadas = 35;
        double valorHora = 50.0;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        double valorHoraModificado = 70.0;
        funcionario.setValorHora(valorHoraModificado);

        assertEquals(valorHoraModificado, funcionario.getValorHora());
    }

    @Test
    public void testarNomeFuncionarioVazio() {
        String nome = "Vinicius";
        int horasTrabalhadas = 30;
        double valorHora = 50.0;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        });
    }

    @Test
    public void testarModificarNomeEntradaValida() {
        String nome = "Lucas";
        int horasTrabalhadas = 35;
        double valorHora = 60.0;

        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        funcionario.setNome("Lucas Azevedo");

        assertEquals("Lucas Azevedo", funcionario.getNome());
    }

    @Test
    public void testarModificarNomeEntradaVazia() {
        String nome = "Lucas";
        int horasTrabalhadas = 35;
        double valorHora = 60.0;

        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setNome("");
        });
    }
}