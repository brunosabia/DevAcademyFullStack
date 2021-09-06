public class Estudante extends Pessoa{
    private String registro;
    private int ano;
    private String curso;
    private String sala;

    public Estudante(String nome, int idade, String cpf, Endereco endereco, String registro, int ano, String curso, String sala) {
        super(nome, idade, cpf, endereco);
        this.registro = registro;
        this.ano = ano;
        this.curso = curso;
        this.sala = sala;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
