public class Cliente {

    private String nome;
    private String sobrenome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            System.out.println("Nome inválido");
        }
        else {
            this.nome = nome;
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
