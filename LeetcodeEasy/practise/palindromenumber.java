package practise;

public class palindromenumber {

    private static Boolean isPalindrome(int i) {

        if (i < 0) {
            return false;
        }

        String s = i + "";

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

    public static void main(String[] args) {


        int i = 121;
        Boolean result = palindromenumber.isPalindrome(i);
        System.out.println("result "+ result);

    }


}
