import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File obj = new File("java1.txt");
        if (obj.delete()){
            System.out.println("Deleted the file successfully: " + obj.getName());
        }else{
            System.out.println("Failed to delete the file");
        }
    }
}
