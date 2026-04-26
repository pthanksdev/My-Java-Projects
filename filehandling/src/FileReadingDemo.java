import java.io.FileInputStream;

public class FileReadingDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\USER\\java2.txt");
            int avlBytes = fis.available();
            System.out.println("Available bytes " + avlBytes);
            byte buff[] = new byte[avlBytes];
            fis.read(buff, 0, avlBytes);
            String str = new String(buff);
            System.out.println(str);
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
