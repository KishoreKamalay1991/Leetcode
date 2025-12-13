public class splitastringinbalancedstring {

    public static int balancedString(String s) {


        int left =0;
        int right = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'L') {
                left++;
            }
            else if(s.charAt(i) == 'R') {
                right++;
            }

            if (left == right) {
                count++;

            }


        }

        return count;


    }

    public static void main(String[] args) {

          String str = "RLRRLLRLRL";
          int result = balancedString(str);
          System.out.println(result);

    }

}
