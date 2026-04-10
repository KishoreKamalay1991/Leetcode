package Hackerrank;

public class Hackerrank1 {

     public static int count(String str, int n, char c) {
		 
		 int alphaCount = 0;
		 
		 for(int i = 0; i < str.length(); i++) {
			 if(str.charAt(i) == c) {
				 alphaCount = alphaCount + 1;
			 }
		 }
		 
		 int repeat = n / str.length();
		 
		 System.out.println(alphaCount);
		 System.out.println(repeat);
		 
		 int totalCount = repeat * alphaCount;
		 System.out.println(totalCount);
		 
		 int remaining = n % str.length();
		 
		 for(int j = 0; j < remaining; j++) {
			  if(str.charAt(j) == c) {
				   totalCount++;
			  }
		 }
		 
		 return totalCount;
		 
	 }

     
    
     public static void main(String[] args) {
		 
		 String s = "abcac";
		 
		 int n = 12;
		 
		 char c = 'a';
		 
		 int result = count(s, n, c);
		 
		 System.out.println("result " + result);
		 
	 }

}
