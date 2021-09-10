import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {


        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
        int numeroInicial = n1;
        int resultado = 1;

        if (n1 < 0) {
            JOptionPane.showMessageDialog(null, "O numero não pode ser negativo!");
        }
        else{
            while(n1 > 0){
                n1--;
                resultado += resultado * n1;
            }
            JOptionPane.showMessageDialog(null,"O fatorial de " + numeroInicial +" vale: " + resultado);
        }
    }
}
