import java.io.IOException;
import java.util.Scanner;

public class arithemeticcalculations {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int input;
            int x;
            int y;
            int addition;
            int subtraction;
            int multiplication;
            double division;

            System.out.println("Input the first number");
            x = scanner.nextInt();
            System.out.println("Input the second number");
            y = scanner.nextInt();

            addition = x + y;
            subtraction = x - y;
            multiplication = x * y;
            division = x / y;

            System.out.println("Choose your arithemetic operation ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Result = " + addition);
            }
            if (input == 2) {
                System.out.println("Result = " + subtraction);
            }
            if (input == 3) {
                System.out.println("Result = " + multiplication);
            }
            if (input == 4) {
                System.out.println("Result = " + division);
            }else {
                System.out.println("The number you input is invalid");
            }
            scanner.close();
        }catch (ArithmeticException e){
            System.out.println("The input is invalid");
        }
    }
}
