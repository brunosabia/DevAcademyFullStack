package br.com.minhaempresa.controller;

import br.com.minhaempresa.exception.SaldoInsuficienteException;
import br.com.minhaempresa.service.DepositoService;
import br.com.minhaempresa.service.SaqueService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/sacar")
public class SaqueController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        double valor = Double.valueOf(req.getParameter("valor"));

        SaqueService ss = new SaqueService();
        try {
            ss.sacar(nome,sobrenome,valor);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
