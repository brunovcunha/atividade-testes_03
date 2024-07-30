package com.iftm.edu.atividade_testes_03;

public class FuncionarioTerceirizado extends Funcionario {

    private double despesas;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesas) {
        super(nome, horasTrabalhadas, valorHora);
        validarDespesa(despesas);
        setDespesas(despesas);
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        validarDespesa(despesas);
        this.despesas = despesas;
    }

    @Override
    public double calcularPagamento() {
        return (getHorasTrabalhadas() * getValorHora()) + (1.1 * despesas);
    }

    public void validarDespesa(double valorDespesa) {
        if (valorDespesa < 0) {
            throw new IllegalArgumentException("Despesas não podem ser negativas.");
        } else if (valorDespesa >= 1000.00) {
            throw new IllegalArgumentException("Despesa não pode ser maior ou igual a R$ 1000.00");
        }
    }

}
