
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hw {
    public static void main(String[] args) {
        Map<String,Map<String,Integer>> map = new TreeMap<>();
        map.put("Abia :",Map.of("UMUAHIA ", 4841943));
        map.put("ADAMAWA :",Map.of("YOLA ",5236948));
        map.put("AKWA IBOM :",Map.of("UYO ",5780581));
        map.put("BAUCHI :",Map.of("BAUCHI ",7540663));
        map.put("BAYELSA :",Map.of("YENAGOA ",2394725));
        map.put("BENUE :",Map.of("MAKURDI ",6687706));
        map.put("BORNO :",Map.of("MAIDUGURI ",6651590));
        map.put("CROSS RIVER :",Map.of("CALABAR ",4175020));
        map.put("DELTA :",Map.of("ASABA ",6107543));
        map.put("EBONYI :",Map.of("ABAKALIKI ",4007155));
        map.put("EDO :",Map.of("BENIN CITY ",5161137));
        map.put("EKITI :",Map.of("ADO EKITI ",3398177));
        map.put("ENUGU :",Map.of("ENUGU ",5396098));
        map.put("GOMBE :",Map.of("GOMBE ",4623462));
        map.put("IMO :",Map.of("OWERRI ",6067722));
        map.put("JIGAWA :",Map.of("DUTSI ",6979080));
        map.put("KADUNA :",Map.of("KADUNA ",8324285));
        map.put("KANO :",Map.of("KANO ",16253549));
        map.put("KASTINA :",Map.of("KASTINA ",9300382));
        map.put("KEBBI :",Map.of("BIRNIN KEBBI ",6001610));
        map.put("KOGI :",Map.of("LOKOJA ",5053734));
        map.put("KWARA :",Map.of("ILORIN ",4259613));
        map.put("LAGOS :",Map.of("IKEJA ",15772884));
        map.put("NASARAWA :",Map.of("LAFIA ",3632239));
        map.put("NIGER :",Map.of("MINNA ",6720617));
        map.put("OGUN :",Map.of("ABEOKUTA ",6445275));
        map.put("ONDO :",Map.of("AKURE ",5469707));
        map.put("OSUN :",Map.of("OSHOGBO ",4237396));
        map.put("OYO :",Map.of("IBANDAN ",7512855));
        map.put("PLATEAU :",Map.of("JOS ",5400974));
        map.put("RIVERS :",Map.of("PORT HARCOURT ",7234973));
        map.put("SOKOTO :",Map.of("SOKOTO ",6163187));
        map.put("TARABA :",Map.of("JALINGO ",4331885));
        map.put("YOBE :",Map.of("DAMATURU ",4350401));
        map.put("ZAMFARAWA :",Map.of("GASUA ", 5517793));
        map.put("FCT :",Map.of("ABUJA ", 4802443));



        for (Map.Entry<String,Map<String,Integer>> e:map.entrySet())
            //printing key-value pairs
            System.out.println(e.getKey() + " " +  e.getValue());

    }
}
