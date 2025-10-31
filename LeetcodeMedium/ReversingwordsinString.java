import java.util.ArrayList;
import java.util.List;

public class ReversingwordsinString {

    public static String reverwords(String str) {

        int len = str.length();

        String s = "";
        str = str.trim();

        int x = 0;

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') {
                x = x + 1;
            }

        }

        int p = x;

        List<String> alllist = new ArrayList<String>();

        for (int i = str.length() - 1; i >= 0; i--) {

            if(str.charAt(i) != ' ') {
               s += str.charAt(i);
            } else {
                System.out.println(s);
                alllist.add(s);
              s = "";
              p--;
            }



        }


        return s;

    }

    public static void main(String[] args) {

     String str = "Hello kamalay kishore";

     String result = reverwords(str);

     System.out.println(result);

    }

}
