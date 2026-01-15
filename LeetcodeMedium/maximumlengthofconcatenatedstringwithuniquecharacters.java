import java.util.ArrayList;
import java.util.List;

public class maximumlengthofconcatenatedstringwithuniquecharacters {

    public static Boolean hasUniqueCharacters(String str) {

        boolean[] hasvisited = new boolean[26];
        for(char ch : str.toCharArray()) {

           if(hasvisited[ch - 'a']) {
              return false;
           } else {
               hasvisited[ch - 'a'] = true;
           }
        }
        return true;
    }

    public static int maxlengthString(String[] arr) {

        List<String> result = new ArrayList<>();
        result.add("");
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if(!hasUniqueCharacters(str)) {
                continue;
            }
            List<String> currlist = new ArrayList<>();
            for (String s : result) {
               StringBuilder sb = new StringBuilder();
               sb.append(s).append(str);
               if(hasUniqueCharacters(sb.toString())) {
                   currlist.add(sb.toString());
               }
            }
            result.addAll(currlist);
        }
        int maxlen = 0;
        for(String str : result) {
             maxlen = Math.max(str.length(), maxlen);
        }
        return maxlen;
    }

    public static void main(String[] args) {

            String[] arr = {"un", "iqb", "ue" };

            int maxlength = maxlengthString(arr);

                System.out.println("max length " + maxlength);

    }

}
