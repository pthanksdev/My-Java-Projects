import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length;
        int breath;
        int Area;
        int Perimeter;
        System.out.println("Enter the length");
        length = scanner.nextInt();
        System.out.println("Enter the breath");
        breath = scanner.nextInt();
        Area = length * breath;
        Perimeter = 2*(length+breath);
        System.out.println("The area of the rectangle is " + Area);
        System.out.println("The perimeter of tha rectangle is " + Perimeter);
        scanner.close();

    }
}
