import java.util.ArrayList;
import java.util.List;

public class ReversingwordsinString {

    public static String reverwords(String s) {

        String[] words = s.trim().split("\\s+");
        int i = 0, j = words.length - 1;
        while (i < j) {
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            i++;
            j--;
        }
        return String.join(" ", words);

    }


    public static void main(String[] args) {

     String str = "Hello kamalay kishore";

     String result = reverwords(str);

     System.out.println(result);

    }

}
