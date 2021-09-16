import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {

        List<String> comandos = new ArrayList<>();

        comandos.add("A - Alpha");
        comandos.add("B - Bravo");
        comandos.add("C - Charlie");
        comandos.add("D - Delta");
        comandos.add("E - Eco");
        comandos.add("F - Foxtrot");
        comandos.add("G - Golf");
        comandos.add("H - Hotel");
        comandos.add("I - India");
        comandos.add("J - Juliet");
        comandos.add("K - Kilo");
        comandos.add("L - Lima");
        comandos.add("M - Mike");
        comandos.add("N - November");
        comandos.add("O - Oscar");
        comandos.add("P - Papa");
        comandos.add("Q - Quebec");
        comandos.add("R - Romeu");
        comandos.add("S - Sierra");
        comandos.add("T - Tango");
        comandos.add("U - Uniform");


        for(String value:comandos){
            System.out.println("comando: "+ value);
        }

        comandos.remove("J - Juliet");
        comandos.remove("G - Golf");
        comandos.remove("U - Uniform");
        comandos.remove("T - Tango");
        comandos.remove("Q - Quebec");

        for(String value:comandos){
            System.out.println("comando: "+ value);
        }

    }
}
