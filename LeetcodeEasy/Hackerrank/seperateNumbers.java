package Hackerrank;

public class seperateNumbers {

  public static void seperateNumbers(String S1) {
	 
	  int n = S1.length();
	  
	  for(int i = 1; i <= n / 2; i++) {
		   String firstChar = S1.substring(0, i);
		   
		   if(firstChar.startsWith("0")) {
			   continue;
		   }
		   
		   long first = Long.parseLong(firstChar);
		   long next = first;
		   
		   StringBuilder sb = new StringBuilder();
		   
		   while(sb.length() < n) {
			   sb.append(next);
			   next++;
		   }
		   
		   if(sb.toString().equals(S1)) {
			   System.out.println("YES" + first);
			   return;
		   }
		   
		   
	  }
	 
	  System.out.println("NO");
	 
  }

   
   
   public static void main(String[] args) {
	  
	  String S1 = "10111213";
	  
	 seperateNumbers(S1);
	  
	  
   }
}
