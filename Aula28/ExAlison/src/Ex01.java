import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

        System.out.println("ex1");
        List<Integer> pacotesDeMateriais = Arrays.asList(1, 3, 4, 6, 8, 9, 23, 51, 14, 42, 13);

        pacotesDeMateriais.stream().filter(itensDoArray -> itensDoArray % 2 == 0).forEach(System.out::println);


        System.out.println("ex2");
        List<Integer> marmitas = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        marmitas.stream().filter(item -> item % 2 == 0).forEach(System.out::println);
    }
}