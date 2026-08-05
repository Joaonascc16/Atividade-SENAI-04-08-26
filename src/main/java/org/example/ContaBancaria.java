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

    public double consultarSaldo() {
        double saldo = getSaldo();
        return saldo;
    }

    public void depositar(double v) {
    }
}

