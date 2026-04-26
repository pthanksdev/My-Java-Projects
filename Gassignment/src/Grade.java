import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("Enter the student score");
        score = scanner.nextInt();
        if (score >= 75) {
            System.out.println("This student passed");
            System.out.println("Grade A");
        } else if (score >= 60) {
            System.out.println("This student scored above average");
            System.out.println("Grade B");
        } else if (score >= 50) {
                System.out.println("This student scored below average");
                System.out.println("Grade C");
        }else{
                System.out.println("You are a failure");
                System.out.println("F9");
            }
        }
    }





