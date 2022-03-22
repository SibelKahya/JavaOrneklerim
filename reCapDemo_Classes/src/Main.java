public class Main {
     //hesap mak
    public static void main(String[] args) {
   DortIslem dortIslem=new DortIslem();
   int toplam= dortIslem.topla(2,30);
   int cikarma=dortIslem.Bolme(4,2);
   int carpma=dortIslem.Carp(5,8);

   System.out.println("toplam sonucu :"+toplam);
   System.out.println( "çıkartma sonucu :"+dortIslem.cikartma(87,80));
    }
}
