import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lettercombinationsphone {

    public static List<String> letterCombinations(String digits) {

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        String[] res = new String[digits.length()];

        for (int i = 0 ; i < digits.length(); i++) {
            res[i] = map.get(digits.charAt(i));

        }



        return Arrays.asList(res);


    }

    public static void main(String[] args) {

        List<String> res = letterCombinations("23");

    }

}
