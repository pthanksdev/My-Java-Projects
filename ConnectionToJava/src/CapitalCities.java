import java.util.Collections;
import java.util.HashMap;

public class CapitalCities {
    public static void main(String[] args) {
        HashMap<String ,String> capitalCities = new HashMap<>();
        //Add keys and values(Country,Cities)
        capitalCities.put("England " , " London");
        capitalCities.put("Germany " , " Berlin");
        capitalCities.put("Norway " , " Oslo");
        capitalCities.put("USA " , " Washignton DC");
        System.out.println(capitalCities);
    }
}
