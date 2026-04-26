import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoOnArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);//sort cars

        for (String i :cars){
            System.out.println(i);
        }
    }
}
