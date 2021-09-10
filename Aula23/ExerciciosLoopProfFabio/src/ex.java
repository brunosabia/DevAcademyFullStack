import javax.swing.*;

public class ex {

    public static void main(String[] args) {

        String valoresDoArray = JOptionPane.showInputDialog("Digite os valores do array (com espaços entre eles)");
        String[]  valores = valoresDoArray.split(" ");
        int[] arrayDeInteiros = new int[valores.length];
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do numero procurado:"));

        for(int i = 0; i < valores.length; i++){
            arrayDeInteiros[i] = Integer.parseInt(valores[i]);
            if(arrayDeInteiros[i] == n){
                JOptionPane.showMessageDialog(null,"O numero foi encontrado na posição "+ i);
            }
        }
    }
}
