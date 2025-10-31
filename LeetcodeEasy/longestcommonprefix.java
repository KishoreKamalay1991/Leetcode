import java.util.Arrays;

// Sort all Strings
// Take first and last string
// compare every character

public class longestcommonprefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        for(String str : strs) {
            System.out.println(str);
        }
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] input = {"czrkjh", "carrace", "carabc"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
    }
}