public class Aviao implements Voador {
    private int horasDeVoo;

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {
        setHorasDeVoo(getHorasDeVoo()+13);
        System.out.println("Estou voando como um avião");
        System.out.println("Horas de Voo: "+ getHorasDeVoo());
    }
}
