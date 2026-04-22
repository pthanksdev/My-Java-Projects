import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> car = new HashSet<>();
        car.add("BMW");
        car.add("Volvo");
        car.add("Ford");
        car.add("Mazda");
        car.add("BMW");
        Iterator<String> it = car.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
