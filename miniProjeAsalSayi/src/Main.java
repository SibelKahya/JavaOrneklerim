public class Main {

    public static void main(String[] args) {
        int number=2; // 25 sayısının asal olup olmadığını bulan program
        int remainder=number%2;  //kalan
        System.out.println(remainder);

        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayı asal değildir");
            return;

        }
        if(number<2){
            System.out.println("geçersiz sayı");
            return;
        }

        for(int i=2;i<number;i++){
            if(number % i==0){
                isPrime=false;

            }

        }
        if (isPrime){
            System.out.println("sayı asaldır");
        }else{
            System.out.println("sayı asal değildir");
        }

    }
}
