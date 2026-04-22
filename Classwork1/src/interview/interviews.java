package interview;

import java.util.Scanner;

public class interviews {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double testA, testB, testC, average;


        // Accept test scores
        System.out.print("Enter Test A score: ");
        testA = scanner.nextDouble();

        System.out.print("Enter Test B score: ");
        testB = scanner.nextDouble();

        System.out.print("Enter Test C score: ");
        testC = scanner.nextDouble();

        // Calculate average
         average = (testA + testB + testC) / 3;

        // Evaluate scores
        if (testA > 75) {
            if (testB > 75) {
                if (testC > 75) {
                    if (average >= 80) {
                        System.out.println("You are invited for the interview");
                    } else {
                        System.out.println("Sorry we’ll get back to you");
                    }
                } else {
                    System.out.println("Sorry we’ll get back to you");
                }
            } else {
                System.out.println("Sorry we’ll get back to you");
            }

            scanner.close();
        }
    }
}



