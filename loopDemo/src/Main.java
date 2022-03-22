public class Main {

    public static void main(String[] args) {
        int i;
        for (i = 2; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
        int j=5;

        while(j<10){
            j++;
            System.out.println(j);

            break;

        }
        System.out.println("while döngüsü bitti ..");
    }
}
