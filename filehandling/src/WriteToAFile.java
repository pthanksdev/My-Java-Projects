import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args){
        try{
            FileWriter write = new FileWriter("java2.txt");
            write.write("Viannatorres is a very strange name");
            write.close();
            System.out.println("successfully wrote the file");
        }catch (IOException er){
            System.out.println("an error occured");
            er.printStackTrace();
        }
    }
}
