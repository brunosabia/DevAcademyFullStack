public class FuncionarioEstatal extends Funcionario{

    public double calcularSalario(double horasTrabalhadas,double valorPorHora){
        salario = horasTrabalhadas * valorPorHora;
        return salario;
    }
}
