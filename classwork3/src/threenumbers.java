import java.util.Scanner;

public class threenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("enter the first number");
        num1 = scanner.nextDouble();
        System.out.println("enter the second number");
        num2 = scanner.nextDouble();
        System.out.println("enter the thrid number");
        num3 = scanner.nextDouble();

        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("num1 is the highest number");
        }else  if ((num2 > num3) && (num3 > num1)) {
                System.out.println("num2 is the highest number");
            } else if ((num3 > num2) && (num2 > num1)) {
                    System.out.println("num3 is the highest number");
                }//else{
         //   System.out.println("what you entered is invalid");
     //   }
            scanner.close();
    }
}

