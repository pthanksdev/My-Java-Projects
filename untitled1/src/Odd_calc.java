import java.util.Arrays;
import java.util.List;

public class Odd_calc {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,22,35,44,55,99,100);
        int factor = 2;
        System.out.println(numbers.stream().filter(number -> number % 2 != 0)
                .mapToInt(e -> e* factor).sum());
    }
}
