import java.util.Arrays;
import java.util.List;

public class Even_calc1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,22,33,44,55,99,100);
        int factor = 2;
        System.out.println(numbers.stream().filter(number -> number % 2 == 0)
                .mapToInt(e -> e* factor).sum());
    }
}