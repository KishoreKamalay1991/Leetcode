import java.util.HashSet;
import java.util.Set;

public class JewelsandCrown {

    public static int jewels(String s1, String t1) {

        Set<Character> s = new HashSet<>();

        int count = 0;

        for(int i = 0; i < s1.length(); i++) {
            s.add(s1.charAt(i));
        }

        for(int j = 0; j < t1.length(); j++) {
            if(s.contains(t1.charAt(j))) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {


        String jewels = "aA";
        String stones = "aAAbbbb";

        int count = jewels(jewels, stones);

        System.out.println("count " + count);



    }


}
