package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeDuplicatesAna {

    public static List<String> removeduplicateAnagram(String[] words) {

        HashSet<String> set = new HashSet<>();

        List<String> ans = new ArrayList<>();

        for (String word : words) {

            char[] strArr = word.toCharArray();
            Arrays.sort(strArr);
            String sortedStr =  new String(strArr);
            if(set.add(sortedStr)) {
                ans.add(word);
            }
        }

        return ans;




    }


    public static void main(String[] args) {

        String[] words = {"tan", "ant", "nat","hnm", "cd", "cd", "nmh"};

        List<String> allword = removeduplicateAnagram(words);

        System.out.println(allword);

    }

}
