package com.iftm.edu.atividade_testes_03;

public class FuncionarioTerceirizado extends Funcionario {
    private double despesasAdicionais;


    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesasAdicionais = despesasAdicionais;
    }

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(double despesasAdicionais) {
        this.despesasAdicionais = despesasAdicionais;
    }
}
