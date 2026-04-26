import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X;
    //    int Y;
        int result;
        System.out.println("Enter the numerator");
        X = scanner.nextInt();
    //    System.out.println("Enter the denominator");
    //    Y = scanner.nextInt();
        result = X%5;
   //     Y = X/5;
        if (result == 0){
            System.out.println("the number is divisible by 5");
        }else {
            System.out.println("The number is not divisible by 5");
        }
//        System.out.println("the result is " + Y);
        scanner.close();

    }
}
