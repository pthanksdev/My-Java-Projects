import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throwsexplanation {
    //private static Object fileReader;

    public static void main(String[] args)throws IOException {
        FileReader file = new FileReader("C:\\Users\\USER\\Documents\\Criterion Games\\Need For Speed(TM) Most Wanted\\wrizz");
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0;counter < 5;counter++){
            System.out.println(fileInput.readLine());
            fileInput.close();
        }
    }
}
