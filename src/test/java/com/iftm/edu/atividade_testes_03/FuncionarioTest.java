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

        Funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

    }
}
