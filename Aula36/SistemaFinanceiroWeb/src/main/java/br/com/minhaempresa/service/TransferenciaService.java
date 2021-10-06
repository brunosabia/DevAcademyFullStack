package br.com.minhaempresa.service;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;
import br.com.minhaempresa.exception.SaldoInsuficienteException;

public class TransferenciaService {

    public void transferir(String nomeA, String sobrenomeA, double valorA,String nomeB, String sobrenomeB) throws SaldoInsuficienteException {
        Cliente pag = new Cliente(nomeA, sobrenomeA);
        Conta conta = new ContaCorrente(pag);
        conta.sacar(valorA);

        Cliente rec = new Cliente(nomeA, sobrenomeA);
        Conta account = new ContaCorrente(rec);
        account.depositar(valorA);


    }

}
