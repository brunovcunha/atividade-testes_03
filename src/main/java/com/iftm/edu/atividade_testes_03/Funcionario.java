package com.iftm.edu.atividade_testes_03;

public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;


    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
