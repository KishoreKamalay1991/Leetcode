import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeDuplicateAnagrams2 {

    public static List<String> removeduplicateAnagram(String[] arr) {

        HashSet<String> set = new HashSet<>();

      List<String> result = new ArrayList<>();

        for (String str : arr) {

            char[] sortedchr = str.toCharArray();
            Arrays.sort(sortedchr);
            String sortedstr = new String(sortedchr);
            if (set.add(sortedstr)) {
                result.add(str);
            }
        }


     return result;


    }

    public static void main(String[] args) {

        String[] words = {"tan", "ant", "nat","hnm", "cd", "cd", "nmh"};

        List<String> allword = removeduplicateAnagram(words);

       System.out.println(allword);


    }
}
