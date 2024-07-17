package com.iftm.edu.atividade_testes_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FuncionarioTest {

    public Funcionario funcionario;

    @BeforeEach
    public void InstanciarObjetos() {
        funcionario = new Funcionario();
    }

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
        String nome = "Joao";
        int horasTrabalhadas = 35;
        double valorHora = 60.0;

        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
        });;
        
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
        double valorHora = 60.0;
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
        double valorHora = 60.0;
        funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        int horasTrabalhadasModificada = 30;
        int resultadoObtido = funcionario.getHorasTrabalhadas();
        assertEquals(horasTrabalhadasModificada, resultadoObtido);
    }
    
    public void testarModificarValorPagamentoInvalido() {

    }

    public void testarModificarValorEntradaInvalida() {

    }

    public void testarModificarValorEntradaValida() {

    }

}
