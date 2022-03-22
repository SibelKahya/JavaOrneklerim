public class Main {

    public static void main(String[] args) {
	//mukemmel sayi:  tam bölenlerinin toplamına eşit olan sayıya denir örn : 6-->1   2   3  -->1+2+3=6

        int number=28;
        int sayac=0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                sayac+=i;

            }

        }
        if(sayac==number){
            System.out.println("sayı mükemmel sayıdır");
        }else {
            System.out.println("sayı nükemmmel  sayı DEĞİLDİR !");
        }

    }
}
