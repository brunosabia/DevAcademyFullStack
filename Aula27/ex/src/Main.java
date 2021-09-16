import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listExemplo = new ArrayList<>();

        listExemplo.add("A1");
        listExemplo.add("B2");
        listExemplo.add("C3");
        listExemplo.add("D4");

        listExemplo.remove(2);

        String valorColeta = listExemplo.get(2);

        //apresentar os valores cadastrados, o for vai varrer a litExemplo e colocar cada valor dentro de valorBuscado
        for(String valorBuscado:listExemplo){
            System.out.println(valorBuscado);
        }
    }
}
