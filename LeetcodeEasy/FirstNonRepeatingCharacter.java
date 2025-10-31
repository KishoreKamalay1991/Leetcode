import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static int firstnonrepeat(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();



        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;


    }


    public static void main(String[] args) {


       int index = firstnonrepeat("kishorekamalay");

       int index1 = firstnonrepeat("leetcode");

       System.out.println("index " + index);

       System.out.println("index1 "+ index1);






    }


}
