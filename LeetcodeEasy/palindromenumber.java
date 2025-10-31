public class palindromenumber {

    public static boolean isPalindrome(int num) {
      
        if(num < 0) {
          return false;
        }
        
        String str = num + "";

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
          if(str.charAt(left) != str.charAt(right)) {
                return false;
          }
          left++;
          right--;
        }

       return true;
    }

    public static void main(String[] args) {


        int i = 121;
        Boolean result = palindromenumber.isPalindrome(i);
        System.out.println("result "+ result);

    }
    
}
