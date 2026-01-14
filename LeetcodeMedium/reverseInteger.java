public class reverseInteger {

  public static int reverseInt(int x) {
	  
	  long rev = 0;
	  
	  while (x != 0) {
		  int digit = x % 10;
		  rev = rev * 10 + digit;
		  x /= 10;
	  }
	  
	  if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
		  return 0;
	  }
	  
	  return (int) rev;
	 
  }

public static void main(String[] args) {
	 
	 int x = 123;
   int reverse = reverseInt(x);
   
   System.out.println("reverse " + reverse);

}

}
