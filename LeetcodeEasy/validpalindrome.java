public class validpalindrome {

    public static boolean isvalid(String s) {

        String validpara = "";
        for ( int i = 0; i < s.length(); i++) {
            int ascii = (int)s.charAt(i);



            if((64 < ascii && ascii < 91) || (47 < ascii && ascii < 58) || (96 < ascii && ascii < 123)) {
                validpara += s.charAt(i);
            }
        }

        validpara = validpara.toLowerCase();
        System.out.println(validpara);

        int start = 0;
        int end = validpara.length() - 1;
        while(start < end) {

            if (validpara.charAt(start) != validpara.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }


        return true;


    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

       Boolean validpalindrome = isvalid(s);

       System.out.println(validpalindrome);

    }


}
