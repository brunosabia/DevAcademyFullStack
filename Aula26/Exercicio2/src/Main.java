public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bruno", 12345);

        Pessoa pessoa1 = new Pessoa("Bruno",123456);

        System.out.println(pessoa.equals(pessoa1));;

    }
}
