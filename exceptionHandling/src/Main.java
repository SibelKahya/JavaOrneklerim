public class Main {

    public static void main(String[] args) {
        try{
            int[] array=new  int[]{1,2,3};
            System.out.println(array[5]);

        }catch (Exception exception){
            System.out.println("Hata oluştu");
        }finally { //ister try çalılşsın isterr catch , finally bloğu her türlü çalışır
            System.out.println("ben her türlü çalışırım");

        }



    }
}
