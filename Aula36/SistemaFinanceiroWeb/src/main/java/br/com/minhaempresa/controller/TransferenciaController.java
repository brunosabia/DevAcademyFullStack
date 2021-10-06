package br.com.minhaempresa.controller;

import br.com.minhaempresa.exception.SaldoInsuficienteException;
import br.com.minhaempresa.service.TransferenciaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/transferir")
public class TransferenciaController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeA = req.getParameter("nome");
        String sobrenomeA = req.getParameter("sobrenome");
        double valor = Double.valueOf(req.getParameter("valor"));
        String nomeB = req.getParameter("nome");
        String sobrenomeB = req.getParameter("sobrenome");

        TransferenciaService ts = new TransferenciaService();
        try {
            ts.transferir(nomeA,sobrenomeA,valor,nomeB,sobrenomeB);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
