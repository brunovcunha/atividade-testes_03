package com.iftm.edu.atividade_testes_03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FuncionarioTest {

    private Funcionario funcionario;

    @Test
    public void testarConstrutorPagamentoInvalido() {
        String nome = "Bruno";
        int horasTrabalhadas = 10;
        double valorHora = 3.0;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        });

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
        int horasTrabalhadas = 10;
        double valorHora = 13.0;

        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        assertEquals(nome, funcionario.getNome());
        assertEquals(horasTrabalhadas, funcionario.getHorasTrabalhadas());
        assertEquals(valorHora, funcionario.getValorHora());

    }
    
    public void testarModificarHorasPagamentoInvalido() {
        
    }
    
    public void testarModificarHorasEntradaInvalida() {

    }
    
    public void testarModificarHorasEntradaValida() {

    }
    
    public void testarModificarValorPagamentoInvalido() {

    }

    public void testarModificarValorEntradaInvalida() {

    }

    public void testarModificarValorEntradaValida() {

    }

}
