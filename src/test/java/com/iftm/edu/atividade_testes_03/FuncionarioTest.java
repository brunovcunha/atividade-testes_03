package com.iftm.edu.atividade_testes_03;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FuncionarioTest {
    @Test
    public void testaConstrutorFuncionarioTest() {
        String nome = "Bruno";
        int horasTrabalhadas = 10;
        double valorHora = 13.0;

        Funcionario funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
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
