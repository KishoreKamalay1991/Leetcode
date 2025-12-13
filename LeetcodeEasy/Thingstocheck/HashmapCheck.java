package Thingstocheck;

import java.util.HashMap;
import java.util.Map;

public class HashmapCheck {

    public static void main(String[] args) {

        Map<String, Integer> maplist = new HashMap<>();

        maplist.put("kishore", 1);
        maplist.put("kiamalay", 2);
        maplist.put("swati", 3);

        // List all entries
        System.out.println(maplist.entrySet());

        // List All keys
        System.out.println(maplist.keySet());

        // list All values
        System.out.println(maplist.values());

        System.out.println(maplist.containsKey("kishore"));

        System.out.println(maplist.containsValue(1));

        // Loop using entry set
        for (Map.Entry<String, Integer> entry : maplist.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }



    }

}
