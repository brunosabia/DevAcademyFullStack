public class FuncionarioTerceirizado extends Funcionario{

    public double calcularSalario(double horasTrabalhadas,double valorPorHora){
        salario = horasTrabalhadas * valorPorHora;
        return salario;
    }

    public double calcularHoraExtra(double horasExtra){
        double valor = 50.00;
        return salario += horasExtra * valor;
    }
}
