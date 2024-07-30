package com.iftm.edu.atividade_testes_03;

public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario( String nome, int horasTrabalhadas,double valorHora) {
        this.horasTrabalhadas = validarHorasTrabalhadas(horasTrabalhadas);
        this.nome = nome;
        this.valorHora = validarValorHora(valorHora);
        validarSalario();
    }

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = validarHorasTrabalhadas(horasTrabalhadas);
        validarSalario();
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validarValorHora(valorHora);
        validarSalario();
    }

    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    private int validarHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40) {
            throw new IllegalArgumentException("Os funcionários podem trabalhar por no máximo 40 horas.");
        } else if (horasTrabalhadas <= 0) {
            throw new IllegalArgumentException("Os funcionários não podem trabalhar por horas negativas!");
        }
        return horasTrabalhadas;
    }

    private double validarValorHora(double valorHora) {
        double salarioMinimo = 1320.00;
        double valorHoraMinimo = salarioMinimo * 0.04;
        double valorHoraMaximo = salarioMinimo * 0.1;
        if (valorHora < valorHoraMinimo || valorHora > valorHoraMaximo) {
            throw new IllegalArgumentException(String.format("Valor por hora deve ser entre R$ %.2f e R$ %.2f", valorHoraMinimo, valorHoraMaximo));
        }
        return valorHora;
    }

    private void validarSalario() {
        double salarioMinimo = 1320.00;
        double salarioAtual = calcularPagamento();
        if (salarioAtual < salarioMinimo) {
            throw new IllegalArgumentException(String.format("Salário deve ser maior ou igual ao salário mínimo, que é atualmente R$ %.2f", salarioMinimo));
        }
    }

    public Funcionario() {
    }


}
