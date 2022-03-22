public class Main {

    public static void main(String[] args) {
  //arkadaş sayılar :iki sayının pozitif tam bölenleri toplamı birbirne eşit oılan sayılara arkadaş sayı denir
        //220-284
        int sayi1=220;
        int total1=0;
        int sayi2=284;
        int total2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                total1+=i;
            }
        }
        for(int j=1;j<sayi1;j++){
            if(sayi2%j==0){
                total2+=j;
            }
        }
        if(total1==sayi2 && total2==sayi1){
            System.out.println(" sayılar mükemmel sayıdır..");
        }else {
            System.out.println("saylar mükemmel sayı değldir!!");
        }
    }
}
