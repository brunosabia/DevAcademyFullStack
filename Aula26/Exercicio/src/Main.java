public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.setEnergia(10);

        Aviao aviao = new Aviao();
        aviao.setHorasDeVoo(13);

        SuperHomem superhomem = new SuperHomem();
        superhomem.setExperiencia(10);

        TorreDeControle torre = new TorreDeControle();
        torre.adicionarVoador(pato);
        torre.adicionarVoador(aviao);
        torre.adicionarVoador(superhomem);

        torre.voemTodos();
    }
}
