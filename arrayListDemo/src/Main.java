import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
     ArrayList sayilar=new ArrayList();

     sayilar.add(1);
     sayilar.add(10);
     sayilar.add("Ankara");
       // System.out.println(sayilar.size());//listenin kaç elamnlı olduğunu yazdı
       // System.out.println(sayilar.get(0));//0. indexteki elemnı ekrana yazdı

      //  sayilar.set(0,100);  //0. eleman artık 100 oldu
       // System.out.println(sayilar.get(0));
       // sayilar.remove(0); //0. indexteki elemanı siler
      // System.out.println(sayilar.get(0));
       // sayilar.clear();//Listedeki tüm elemanları silmeye yarar

        for (Object i:sayilar){
            System.out.println(i);
        }




    }
}
