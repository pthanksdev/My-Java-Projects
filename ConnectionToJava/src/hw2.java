import java.util.Map;
import java.util.TreeMap;

public class hw2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("Abia - UMUAHIA :",4841943);
        map.put("ADAMAWA - YOLA :",5236948);
        map.put("AKWA IBOM - UYO :",5780581);
        map.put("BAUCHI - BAUCHI :",7540663);
        map.put("BAYELSA - YENAGOA :",2394725);
        map.put("BENUE - MAKURDI :",6687706);
        map.put("BORNO - MAIDUGURI :",6651590);
        map.put("CROSS RIVER - CALABAR :",4175020);
        map.put("DELTA - ASABA :",6107543);
        map.put("EBONYI - ABAKALIKI :",4007155);
        map.put("EDO - BENIN CITY :",5161137);
        map.put("EKITI - ADO EKITI :",3398177);
        map.put("ENUGU - ENUGU :",5396098);
        map.put("GOMBE - GOMBE :",4623462);
        map.put("IMO - OWERRI :",6067722);
        map.put("JIGAWA - DUTSI :",6979080);
        map.put("KADUNA - KADUNA :",8324285);
        map.put("KANO - KANO :",16253549);
        map.put("KASTINA - KASTINA :",9300382);
        map.put("KEBBI - BIRNIN KEBBI :",6001610);
        map.put("KOGI  - LOKOJA :",5053734);
        map.put("KWARA - ILORIN :",4259613);
        map.put("LAGOS - IKEJA :",15772884);
        map.put("NASARAWA - LAFIA :",3632239);
        map.put("NIGER - MINNA :",6720617);
        map.put("OGUN - ABEOKUTA :",6445275);
        map.put("ONDO - AKURE :",5469707);
        map.put("OSUN - OSHOGBO :",4237396);
        map.put("OYO - IBANDAN :",7512855);
        map.put("PLATEAU - JOS :",5400974);
        map.put("RIVERS - PORT HARCOURT :",7234973);
        map.put("SOKOTO - SOKOTO :",6163187);
        map.put("TARABA - JALINGO :",4331885);
        map.put("YOBE - DAMATURU :",4350401);
        map.put("ZAMFARAWA - GASUA :",5517793);
        map.put("FCT - ABUJA :",4802443);



        for (Map.Entry<String,Integer> e: map.entrySet())
            //printing key-value pairs
            System.out.println(e.getKey() + " " +  e.getValue());

    }
}
