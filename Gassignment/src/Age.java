import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int BD;
        int CY;
        int age;
        System.out.println("Enter the current year");
        CY = scanner.nextInt();
        System.out.println("Enter your birthdate");
        BD = scanner.nextInt();
        age = CY - BD;
        System.out.println("your age is " + age);
        scanner.close();
    }
}
