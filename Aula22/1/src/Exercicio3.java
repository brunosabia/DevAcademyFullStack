import javax.swing.*;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        int soma = 0;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros serão fatorados: "));
        do{
            int m  = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ n + " numero"));

            for (int i = m; i>0 ; i--){

                int conta = m*i;
                soma += m*i;
                System.out.println(m + "x" + i + " = "+ conta);
                //JOptionPane.showMessageDialog(null,m + "x" + i + " = "+ conta);
            }
            JOptionPane.showMessageDialog(null,"Soma: " + soma);
            n--;
        }while(n > 0);
    }
}
