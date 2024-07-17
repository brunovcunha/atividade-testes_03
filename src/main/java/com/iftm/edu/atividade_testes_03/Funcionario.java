package com.iftm.edu.atividade_testes_03;

public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public String getNome() {
        return nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Funcionario() {
    }

    public Funcionario( String nome, int horasTrabalhadas,double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.nome = nome;
        this.valorHora = valorHora;
    }
}
