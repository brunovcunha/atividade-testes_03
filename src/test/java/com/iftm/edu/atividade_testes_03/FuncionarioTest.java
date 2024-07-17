package com.iftm.edu.atividade_testes_03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FuncionarioTest {

    public Funcionario funcionario;

    @Test
    public void testaConstrutorFuncionarioTest() {
        String nome = "Bruno";
        int horasTrabalhadas = 10;
        double valorHora = 13.0;

        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);


    }

    public void testarConstrutorPagamentoInvalido() {

    }

    public void testarConstrutorEntradaValorHoraInvalida() {

    }

    public void testarConstrutorEntradaHorasInvalida() {

    }

    public void testarConstrutorEntradasValida() {

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
