package org.example;

public class ContaBancaria {

    private int conta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getConsultarSaldo() {
        double saldo = getSaldo(); //método de pegar saldo
        return saldo; //retorna saldo atual
    }

    public void setDepositar(double valor) {
        setSaldo(getSaldo() + valor); //recebe
    }

    public void setSacar(double valor) {

    }

}

