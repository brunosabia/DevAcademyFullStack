import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex2 {

    public static void main(String[] args) {

        //exercicio 1
        String nomesFuncionarios = JOptionPane.showInputDialog("Digite os nomes dos Funcionários (com espaços entre eles)");
        String[] nomes = nomesFuncionarios.split(" ");

        for (int i = 0; i < nomes.length; i++) {
            JOptionPane.showMessageDialog(null, "Bem-vindo ao mundo do TI, Coder " + nomes[i] + " Indice: " + i);
        }

        //exercicio 2
        String[] projetos = {"frontEnd", "backEnd", "bancoDeDados", "QAouTester"};
        String temp = projetos[3];
        projetos[3] = projetos[1];
        projetos[1] = temp;
        for (int i = 0; i < projetos.length; i++)
            System.out.println(projetos[i]);

        //exercicio 3
        int[] ordem = {1, 3, 2, 4};

        for (int i = 0; i < ordem.length - 1; i++) {
            if (ordem[i] > ordem[i + 1]) {
                int temporaria = ordem[i];
                ordem[i] = ordem[i + 1];
                ordem[i + 1] = temporaria;
            }
        }
        for (int i = 0; i < ordem.length; i++)
            System.out.println(ordem[i]);


        //exercicio4
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        Collections.shuffle(numeros);
        System.out.println(numeros.toString());

    }



}




