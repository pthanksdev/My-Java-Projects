import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input, result;
        System.out.println("Enter the input");
        input = scanner.nextDouble();
        result = input % 2;
        if (result == 0){
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
        scanner.close();
    }
}
