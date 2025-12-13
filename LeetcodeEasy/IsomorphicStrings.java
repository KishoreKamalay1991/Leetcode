import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())  {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (map1.containsKey(c1) && map1.get(c1) != t1)
                return false;   // inconsistent forward mapping
            if (map2.containsKey(t1) && map2.get(t1) != c1)
                return false;   // inconsistent reverse mapping

            map1.put(c1, t1);
            map2.put(t1, c1);


        }


        return true;

    }

    public static void main(String[] args) {

        String s = "egg";

        String t = "att";


        Boolean res = isIsomorphic(s, t);



    }

}
