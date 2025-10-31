import java.util.HashSet;

public class longestpalindromeSubstring {

    private static boolean isPalindrome(String t) {
        int l = 0, r = t.length() - 1;
        while (l < r) {
            if (t.charAt(l++) != t.charAt(r--)) return false;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        if (s.length() == 1) return s;

        String best = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // j must go <= n because substring's end is exclusive
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > best.length()) {
                    best = sub;
                }
            }
        }
        return best;
    }


    public static void main(String[] args) {

        String str = "bb";

        String longest =  longestPalindrome(str);


    }

}
