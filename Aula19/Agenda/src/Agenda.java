import java.util.List;

public class Agenda {

    private List<Pessoa> listaDePessoas;

    public Agenda(List<Pessoa> listaDePessoas) {
        this.listaDePessoas = listaDePessoas;
    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public void addPessoa(Pessoa p) {
        this.listaDePessoas.add(p);
    }

    public void removePessoa(Pessoa p) {
        this.listaDePessoas.remove(p);
    }
}
