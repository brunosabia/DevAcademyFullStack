import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {


        for (int i = 1; i<=5; i++) {
            int array[] = {0};

            JTextField aField = new JTextField(5);
            JTextField bField = new JTextField(5);

            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("a:"));
            myPanel.add(aField);
            myPanel.add(Box.createHorizontalStrut(15));
            myPanel.add(new JLabel("b:"));
            myPanel.add(bField);

            int result = JOptionPane.showConfirmDialog(null, myPanel,
                    "Please Enter A and B Values for the "+ i + " time", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                System.out.println(aField.getText());
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());

                for (int n = a; n <= b; n++){
                    if(n%2 == 0){
                        System.out.println("Numero par: "+ n);
                    }
                }

            }


        }
    }
}
