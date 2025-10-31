public class DetectCapital {

    public static boolean iscapital(String word) {

        int count = 0;

        int wordlen = word.length();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {

              count ++;

            }

        }
        return (count == 0 || count == wordlen || (count == 1 && Character.isUpperCase(word.charAt(0))));
    }

    public static void main(String[] args) {

        // When all letters are capitals
        // When all letters are small
        // When First Letter is capital.

        Boolean isCapital1 = iscapital("leetcode");
        Boolean isCapital2 = iscapital("USA");
        Boolean isCapital3 = iscapital("Google");

    }
}
