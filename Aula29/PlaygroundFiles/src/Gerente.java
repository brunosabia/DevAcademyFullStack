import java.time.LocalDate;

public class Gerente extends FuncionarioPessoaFisica implements Demitidor{

    private static final double BONIFICACAO = 1.12;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void demitir(Funcionario funcionario) throws Exception {
        if(funcionario instanceof Gerente)
            throw  new Exception("Voce nao pode demitir este funcionario");

            funcionario.setDataDeDemissao(LocalDate.now());

    }

    @Override
    public double consultarContraCheque(){
        return super.consultarContraCheque() * BONIFICACAO;
    }

    public void reajustarSalario(Funcionario funcionario, double novoSalario) throws Exception {
        if (funcionario instanceof Gerente){
            throw new Exception("Voce não pode reajustar o salario de um gerente");
        }
        if(novoSalario <= funcionario.getSalarioBase()){
            throw new Exception("Novo valor de salario menos ou igual ao salario atual");
        }

        funcionario.setSalarioBase(novoSalario);
    }
}
