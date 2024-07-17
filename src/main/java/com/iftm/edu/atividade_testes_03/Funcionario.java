package com.iftm.edu.atividade_testes_03;

public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario( String nome, int horasTrabalhadas,double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.nome = nome;
        this.valorHora = valorHora;
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
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validarValorHora(valorHora);
    }

    private int validarHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas <= 0 || horasTrabalhadas > 40) {
            throw new IllegalArgumentException("Horas trabalhadas devem estar entre 0 e 40");
        }
        return horasTrabalhadas;
    }

    private double validarValorHora(double valorHora) {
        double salarioMinimo = 1320.0;
        if (valorHora < salarioMinimo * 0.04 || valorHora > salarioMinimo * 0.1) {
            throw new IllegalArgumentException("Valor por hora deve ser entre 52.8 e 132.0");
        }
        return valorHora;
    }

    public Funcionario() {
    }


}
