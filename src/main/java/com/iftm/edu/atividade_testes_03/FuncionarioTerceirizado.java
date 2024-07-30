package com.iftm.edu.atividade_testes_03;

public class FuncionarioTerceirizado extends Funcionario {

    private double despesas;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesas) {
        super(nome, horasTrabalhadas, valorHora);
        setDespesas(despesas);
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        if (despesas < 0) {
            throw new IllegalArgumentException("Despesas não podem ser negativas.");
        }
        this.despesas = despesas;
    }

    @Override
    public double calcularPagamento() {
        return (getHorasTrabalhadas() * getValorHora()) + (1.1 * despesas);
    }

}
