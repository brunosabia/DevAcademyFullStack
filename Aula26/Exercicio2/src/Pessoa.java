import java.util.Objects;

public class Pessoa {
    private String nome;
    private int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return rg == pessoa.rg && Objects.equals(rg, pessoa.rg);
    }

}
