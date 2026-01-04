public class ispalindromevalid {
    // time complexity o(n)
    // space complexitty o(1)

    public static boolean isvalidpalindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // skip non alpha numeric
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;


    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";



        Boolean result = isvalidpalindrome(s);



    }

}
