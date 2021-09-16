import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {
        Set<String> cadastros = new HashSet<>();

        cadastros.add("01-Cimento");
        cadastros.add("02-Argamassa");
        cadastros.add("03-Caibros");
        cadastros.add("04-Cal");
        cadastros.add("05-Pedras");
        cadastros.add("06-Caminhão de água");
        cadastros.add("07-Betoneira");
        cadastros.add("08-Servicos de obras A - Arquiteto");
        cadastros.add("09-Servicos de obras B - Chefe de obras");
        cadastros.add("10-Servicos de obras C - Pedreiro");


        cadastros.remove("08-Servicos de obras A - Arquiteto");
        cadastros.remove("02-Argamassa");
        cadastros.remove("06-Caminhão de água");

        for(String value: cadastros){
            System.out.println(value);
        }


    }
}
