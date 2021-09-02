import sun.text.bidi.BidiRun;

public class SistemaFinanceiro {

    public static void main(String[] args){
        Cliente clientex = new Cliente();
        clientex.setNome(null);
        clientex.setSobrenome("de Tal");

        Conta contax = new Conta(clientex);
        System.out.println(contax.getNumero());
        System.out.println(contax.getSaldo());
        System.out.println(contax.getTitular().getNome());
        System.out.println(contax.getTitular().getSobrenome());
    }
}
