import java.util.Scanner;

public class Even_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 6 numbers:");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int input4 = scanner.nextInt();
        int input5 = scanner.nextInt();
        int input6 = scanner.nextInt();
        scanner.close();

        int evenCount = 0;
        int evenSum = 0;
        String evenNumbers = "";

        // Check first number
        switch (input1 % 2) {
            case 0:
                evenCount++;
                evenSum += input1;
                evenNumbers += input1 + " ";
                break;
        }
        // Check second number
        switch (input2 % 2) {
            case 0:
                evenCount++;
                evenSum += input2;
                evenNumbers += input2 + " ";
                break;
        }
        // Check third number
        switch (input3 % 2) {
            case 0:
                evenCount++;
                evenSum += input3;
                evenNumbers += input3 + " ";
                break;
        }
        // Check fourth number
        switch (input4 % 2) {
            case 0:
                evenCount++;
                evenSum += input4;
                evenNumbers += input4 + " ";
                break;
        }
        // Check fifth number
        switch (input5 % 2) {
            case 0:
                evenCount++;
                evenSum += input5;
                evenNumbers += input5 + " ";
                break;
        }
        // Check sixth number
        switch (input6 % 2) {
            case 0:
                evenCount++;
                evenSum += input6;
                evenNumbers += input6 + " ";
                break;
        }

        // Print result
        switch (evenCount > 1 ? 1 : 0) {
            case 1:
                System.out.println("Even numbers: " + evenNumbers);
                System.out.println("Sum of even numbers: " + evenSum);
                break;
            default:
                System.out.println("Not enough even numbers.");
        }
    }
}