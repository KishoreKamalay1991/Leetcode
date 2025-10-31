import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class removeDuplicateAnagrams {

    public static void main(String[] args) {

        String[] words = {"tan", "ant", "nat","hnm", "cd", "cd", "nmh"};

        int[] arr = new int[words.length];

        List<String> result = new ArrayList<>();


        Map<String, Integer> removedDuplicates = new HashMap<>();

        int j = 0;

        for (int i = 0; i < words.length; i++) {

            char[] ele = words[i].toCharArray();
            Arrays.sort(ele);
            String sortedStr = new String(ele);

            if (removedDuplicates.containsKey(sortedStr)) {
            removedDuplicates.put(sortedStr, removedDuplicates.get(sortedStr));
            } else {
                removedDuplicates.put(sortedStr, i);
                arr[j] = i;
                j++;
            }

        }

       for(int p = 0; p < j; p++) {
        result.add(words[arr[p]]);
       }
       
       
       System.out.println(result);
        


    }

    
}
