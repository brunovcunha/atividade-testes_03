package com.iftm.edu.atividade_testes_03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTerceirizadoTest {

    private FuncionarioTerceirizado funcionarioTerceirizado;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testarConstrutorEntradaDespesasInvalida() {
        String nome = "Carlos";
        int horasTrabalhadas = 30;
        double valorHora = 50.0;
        double despesasInvalidas = -100.0;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesasInvalidas);
        });
    }

    @Test
    public void testarConstrutorEntradasValida() {
        String nome = "Carlos";
        int horasTrabalhadas = 30;
        double valorHora = 50.0;
        double despesasValidas = 200.0;

        funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesasValidas);

        assertEquals(nome, funcionarioTerceirizado.getNome());
        assertEquals(horasTrabalhadas, funcionarioTerceirizado.getHorasTrabalhadas());
        assertEquals(valorHora, funcionarioTerceirizado.getValorHora());
        assertEquals(despesasValidas, funcionarioTerceirizado.getDespesas());
    }

    @Test
    public void testarModificarDespesasEntradaInvalida() {
        String nome = "Carlos";
        int horasTrabalhadas = 30;
        double valorHora = 50.0;
        double despesasValidas = 200.0;

        funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesasValidas);

        double despesasInvalidas = -50.0;
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioTerceirizado.setDespesas(despesasInvalidas);
        });
    }

    @Test
    public void testarModificarDespesasEntradaValida() {
        String nome = "Carlos";
        int horasTrabalhadas = 30;
        double valorHora = 50.0;
        double despesasValidas = 200.0;

        funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesasValidas);

        double despesasModificadas = 300.0;
        funcionarioTerceirizado.setDespesas(despesasModificadas);

        assertEquals(despesasModificadas, funcionarioTerceirizado.getDespesas());
    }

    @Test
    public void testarModificarNomeEntradaValida() {
        String nome = "Lucas";
        int horasTrabalhadas = 25;
        double valorHora = 70.0;
        double despesas = 300.0;

        funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesas);
        funcionarioTerceirizado.setNome("Joana Silva");

        assertEquals("Joana Silva", funcionarioTerceirizado.getNome());
    }

    @Test
    public void testarModificarNomeEntradaVazia() {
        String nome = "Lucas";
        int horasTrabalhadas = 30;
        double valorHora = 70.0;
        double despesas = 400.0;

        funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesas);
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioTerceirizado.setNome("");
        });
    }
}