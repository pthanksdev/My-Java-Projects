import javax.swing.*;
import java.io.File;

public class Getmoreinfo {
    public static void main(String[] args) {
        File obj = new File("java2.txt");
        if (obj.exists()) {
            System.out.println("File Name: " + obj.getName());
            System.out.println("Absolute path: " + obj.getAbsolutePath());
            System.out.println("Writable: " + obj.canWrite());
            System.out.println("Readable: " + obj.canRead());
            System.out.println("File size in byte: " + obj.length());
        }else
            System.out.println("The file does not exist");
    }
}
