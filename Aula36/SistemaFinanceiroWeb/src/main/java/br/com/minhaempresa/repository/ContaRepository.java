package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;

public class ContaRepository {

    public double consultarSaldo(){
        Conexao conexao = new Conexao();
        EntityManager entityManager = conexao.getConexao();
        return 0;
    }


}
