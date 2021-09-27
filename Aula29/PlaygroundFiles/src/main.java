import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Fulano",4000);
        Funcionario supervisor = new Supervisor("Beltrano",3500);
        Funcionario funcionario = new Funcionario("Ciclano",4000);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(supervisor);
        funcionarios.add(funcionario);

        funcionarios.forEach(f -> System.out.println(f.consultarContraCheque()));
    }
}
