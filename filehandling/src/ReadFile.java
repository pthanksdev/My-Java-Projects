import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try {
            File obj = new File("java2.txt");
            Scanner Read = new Scanner(obj);
            while (Read.hasNextLine()){
                String data = Read.nextLine();
                System.out.println(data);
            }Read.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
