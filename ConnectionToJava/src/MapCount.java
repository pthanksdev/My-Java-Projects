import java.util.Map;
import java.util.TreeMap;

public class MapCount {
    public static void main(String[] args) {
        //creating an empty treemap
        Map<String,Integer> map = new TreeMap<>();
        //inserting custom elements in the map
        //using put() method
        map.put("NIGERIA" , 250000);
        map.put("GHANA" , 25000);
        map.put("MALI" , 10000);
        //iterating over Map using for each loop
        for (Map.Entry<String,Integer> e: map.entrySet())
            //printing key-value pairs
            System.out.println(e.getKey() + "   " + e.getValue());
    }
}
