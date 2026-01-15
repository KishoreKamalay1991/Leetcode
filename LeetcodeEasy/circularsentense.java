public class circularsentense {

    public static boolean iscircular(String str) {

        String[] words = str.split(" ");

        if(words.length == 1 && str.charAt(0) == str.charAt(str.length() - 1)) {
            return true;
        }
        if(words.length == 1 && str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             if((!Character.isLetter(ch) && str.charAt(i - 1) != str.charAt(i + 1)) || (str.charAt(0) != str.charAt(str.length() - 1))) {
                 return false;
             }
        }
       return true;
    }

    public static void main(String[] args) {

        String s = "leetcode exercises sound delightful";

        Boolean result = iscircular(s);

    }

}
