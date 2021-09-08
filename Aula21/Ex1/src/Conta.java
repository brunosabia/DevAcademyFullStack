public class Conta {
    private String numeroDaConta;
    private double saldo;
    private Cliente titular;

    public void sacar(double quantia){
        if(saldo < quantia){
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= quantia;
        }
    }

    public double depositar(double quantia){
        System.out.println(saldo);
        return this.saldo += quantia;
    }

}
