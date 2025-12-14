import java.util.Arrays;

public class validAnagrams {

    public static boolean isValidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        for (int i = 0 ; i < sArr.length ; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

         Boolean isValid = isValidAnagram("cat", "act");

    }

}
