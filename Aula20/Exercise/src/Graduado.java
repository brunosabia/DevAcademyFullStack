import java.util.Date;

public class Graduado extends Estudante {

    private Date dataGraduacao;
    private String posGraduacao;

    public Graduado(String nome, int idade, String cpf, Endereco endereco, String registro, int ano, String curso, String sala) {
        super(nome, idade, cpf, endereco, registro, ano, curso, sala);
    }

    //sobrecarga
    public Graduado(String nome, int idade, String cpf, Endereco endereco, String registro, int ano, String curso, String sala, Date dataGraduacao, String posGraduacao) {
        super(nome, idade, cpf, endereco, registro, ano, curso, sala);
        this.dataGraduacao = dataGraduacao;
        this.posGraduacao = posGraduacao;
    }

    public Date getDataGraduacao() {
        return dataGraduacao;
    }

    public void setDataGraduacao(Date dataGraduacao) {
        this.dataGraduacao = dataGraduacao;
    }

    public String getPosGraduacao() {
        return posGraduacao;
    }

    public void setPosGraduacao(String posGraduacao) {
        this.posGraduacao = posGraduacao;
    }
}
