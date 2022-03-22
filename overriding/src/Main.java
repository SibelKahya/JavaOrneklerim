public class Main {

    public static void main(String[] args) {

        BaseKrediManager[] baseKrediManager=new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
        for(BaseKrediManager krediManager:baseKrediManager){
            System.out.println(krediManager.hesapla(1000));


        }
    }
}
