public class reverseString {
   public static void main(String[] args) {
	   String Str =  "kamalay";
	   char[] crs = Str.toCharArray();
	   String reverse = "";
	   int start = 0;
	   int end = crs.length - 1;
	   while (start < end) {
		  char temp = crs[end];
		  crs[end] = crs[start];
		  crs[start] = temp;
		  start++;
		  end--;
	   }
	   reverse = new String(crs);
	  System.out.println("reverse " + reverse);
   }
}
