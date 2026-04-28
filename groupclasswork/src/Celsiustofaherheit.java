import java.io.IOException;
import java.util.Scanner;

public class Celsiustofaherheit {
    public static void main(String[] args) {
        try {
            double celcius;
            double fahrenheit;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the celcius");
            celcius = scanner.nextDouble();
            fahrenheit = (celcius * 9 / 5) + 32;
            System.out.println("Celsius - Fahrenheit = " + fahrenheit + " degrees");
            scanner.close();
        }catch (Exception e ){
            System.out.println("An error occured");
        }
    }
}
