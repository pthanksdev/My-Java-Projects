import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args){
        try {
            File  obj = new File("java.txt");
            if (obj.createNewFile()){
                System.out.println("file created: " + obj.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
}
