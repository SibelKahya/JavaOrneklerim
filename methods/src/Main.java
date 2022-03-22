public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=11;
        boolean varMi=false;
        for(int aranan:sayilar){
            if(aranan==aranacak){
                varMi =true;
                break;
            }
        }
        if(varMi){
            mesajVer(aranacak);
        }else{
            System.out.println("sayı mevcut değil!!");
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("sayı mevcuttur"  +aranacak);
    }
}
