public class Exercicio1 {

    public static void main(String[] args) {
        int contratacao = 1995;
        double aumento = 0.015;
        double salario = 1000.0;

        do {
            if (contratacao == 1996) {
                salario += salario * aumento;

            } else if(contratacao> 1996){
                aumento *= 2;
                salario += salario * (aumento);

            }
            System.out.printf("Valor: %.2f", salario);
            System.out.println("  -> Salario do ano " + contratacao);

            contratacao++;
        } while (contratacao <= 2021);
    }

}
