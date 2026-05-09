import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input,input1,input2,input3,input4,input5,result1,result2,result3,
                result4,result5,result6;
        System.out.println("Enter 6 numbers");
        input = scanner.nextInt();
        input1 = scanner.nextInt();
        input2 = scanner.nextInt();
        input3 = scanner.nextInt();
        input4 = scanner.nextInt();
        input5 = scanner.nextInt();
        result1 = input % 2;
        result2 = input1 % 2;
        result3 = input2 % 2;
        result4 = input3 % 2;
        result5 = input4 % 2;
        result6 = input5 % 2;
        if ((result1 == 0) && (result2 == 0) && (result3 == 0) && (result4 == 0)
        && (result5 == 0) && (result6 == 0)){
            System.out.println();
        } else {
            System.out.println("the number is odd");
        }
    }
}