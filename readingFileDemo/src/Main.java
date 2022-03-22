import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static
    int total=0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"))) {
            String line;
            while ((line=reader.readLine())!=null){
                total+= Integer.valueOf(line);
            }
            System.out.println("Toplam ="+ total);
        }
    }
}
