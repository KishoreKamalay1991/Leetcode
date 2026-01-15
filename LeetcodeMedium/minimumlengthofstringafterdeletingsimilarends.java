public class minimumlengthofstringafterdeletingsimilarends {

    public static int minlen(String str) {

        int start = 0;
        int end = str.length() - 1;

        while(start < end && str.charAt(start) == str.charAt(end)) {
             char ch = str.charAt(start);
             while(start <= end && str.charAt(start) == ch) {
               start++;
             }
             while(end < start && str.charAt(end) == ch) {
                 end--;
             }
        }
          int minlen = start - end + 1;
        return minlen;
    }

    public static void main(String[] args) {

        String str = "aabccabba";

        int minlength = minlen(str);

    }

}
