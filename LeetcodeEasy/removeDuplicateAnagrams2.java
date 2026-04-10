import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeDuplicateAnagrams2 {

public static List<String> removeAnagrams(String[] words) {
    
    List<String> result = new ArrayList();
    String lastSorted = "";
    
    for(int i = 0; i < words.length; i++) {
        char[] cars =  words[i].toCharArray();
        Arrays.sort(cars);
        String sortedStr = new String(cars);
        if (!sortedStr.equals(lastSorted)) {
            result.add(words[i]);
            lastSorted = sortedStr; // Update the "previous" marker
        }
    }
    
    return result;
}

    public static void main(String[] args) {

        String[] words = {"tan", "ant", "nat","hnm", "cd", "cd", "nmh"};

        List<String> allword = removeAnagrams(words);

       System.out.println(allword);


    }
}
