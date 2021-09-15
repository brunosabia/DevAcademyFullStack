public class SuperHomem implements Voador{
    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        setExperiencia(getExperiencia()+3);
        System.out.println("Estou voando como um campeão");
        System.out.println("Experiencia: " + getExperiencia());
    }
}
