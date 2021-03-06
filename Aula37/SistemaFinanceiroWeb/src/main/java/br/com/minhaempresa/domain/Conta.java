package br.com.minhaempresa.domain;

import br.com.minhaempresa.exception.SaldoInsuficienteException;

public abstract class Conta {

    private int id;
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(Cliente titular){
        this.saldo = 0.0;
        this.numero = "1";
        this.titular = titular;
    }

    public Conta(Cliente titular, String numero) {
        this.saldo = 0;
        this.numero = numero;
        this.titular = titular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {

        return numero;

    }

    public void setNumero(String numero) {

        this.numero = numero;

    }

    public double getSaldo() {

        return saldo;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public Cliente getTitular() {

        return titular;

    }

    public void setTitular(Cliente titular) {

        this.titular = titular;

    }

    public void sacar(double valor) throws SaldoInsuficienteException, IllegalArgumentException {
        System.out.println("tentativa de saque na conta" + this.numero + " no valor de :" + valor);
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor para saque inválido");
        }
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        this.saldo -= valor;
        //saldo = saldo - valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
        //saldo = saldo + valor;
    }

    public void transferir(double valor, Conta destino) throws IllegalArgumentException, SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public boolean equals(Object objeto) {
        if (super.equals(objeto)) {
            return true;
        } if ((objeto instanceof Conta) && (objeto != null)) {
            Conta conta = (Conta) objeto;
            return this.numero.equals(conta.numero);
        } else {
            return false;
        }
    }
}
