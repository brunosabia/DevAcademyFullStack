public class Ex01 {


    public static void main(String[] args) {

        //ex1
        for (int i = 1; i <= 7; i++) {
            System.out.println(" A garagem tem " + i + " carros!");
        }

        //ex2
        int n = 8;
        while (n != 0) {
            System.out.println("Ainda restam "+ n + "produtos");
            n--;
        }

        //ex3
        int dosesMax = 15;
        int d = 1;
        do{
            System.out.println("O Paciente pode tomar a medicação do dia " + d);
            d++;
        }
        while(d <= dosesMax);


    }
}
