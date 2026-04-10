package Hackerrank;

public class findDigits {

   public static int findCount(int n) {
	   
	   String div = n + "";
	   
	   int count = 0;
	   
	   for(int i = 0; i < div.length(); i++) {
		   int num = Integer.parseInt(String.valueOf(div.charAt(i)));
		   System.out.println(num);
		   
		   if(num != 0 && n % num == 0) {
			   count++;
		   }
	   }
	   
	   return count;
   }
   
    public static void main(String[] args) {
		
		
		int n = 1012;
		
		int result = findCount(n);
		
		System.out.println("result " + result);
		
		
	}

}
