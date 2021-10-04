package br.com.minhaempresa.controller;

import br.com.minhaempresa.domain.Operacao;
import br.com.minhaempresa.service.CalculadoraService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calcular")
public class CalculadoraController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double operandoA = Double.valueOf(req.getParameter("operandoA"));
        double operandoB = Double.valueOf(req.getParameter("operandoB"));
        double resultado = 0;
        int operador = Integer.valueOf(req.getParameter("operador"));

        CalculadoraService calculadoraService = new CalculadoraService();

        Operacao operacao = null;

        switch (operador){
            case 0:{operacao = Operacao.SOMA;break;}
            case 1:{operacao = Operacao.SUBTRACAO;break;}
            case 2:{operacao = Operacao.MULTIPLICACAO;break;}
            case 3:{operacao = Operacao.DIVISAO;break;}
            default:{}
        }
        resultado = calculadoraService.calcular(operandoA,operandoB,operacao);
        resp.getWriter().println(resultado);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Servlet no ar");
    }
}
