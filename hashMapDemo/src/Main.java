import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk=new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","Bilgisayar");
        System.out.println(sozluk.size());

        for( String item:sozluk.keySet()){ //keyset eleanları liste olarak verir
            System.out.println("Eleman - "+item+", Değer-"+sozluk.get(item));


        }

        sozluk.remove("table");      //silme
        System.out.println(sozluk.get("table"));  // null  döner ekranda
        sozluk.clear();  //tüm elemanları siler


    }
}
