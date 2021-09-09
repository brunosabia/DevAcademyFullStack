public class Loops {

    public static void main(String []args){
        int pares = 0;
        int impares = 0;

        for(int i = 0; i<=20; i++){
            if(i%2 != 0){
                impares += i;
                System.out.println("Impar: "+ i);
            }else{
                pares += i;
                System.out.println("Par: " + i);
            }
        }
        System.out.println("Impares: "+ impares);
        System.out.println("Pares: "+ pares);
    }
}
