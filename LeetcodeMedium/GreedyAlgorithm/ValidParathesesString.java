package GreedyAlgorithm;

public class ValidParathesesString {

  public static boolean checkValidString(String str) {
	  
	  int openMax = 0;
	  int openMin = 0;
	  
	  for(char c : str.toCharArray()) {
		  if(c == '(') {
			  openMax++;
			  openMin++;
		  } else if (c == ')') {
			  openMax--;
			  openMin--;
		  } else {
			  openMax++;
			  openMin--;
		  }
		  
		  if(openMax < 0) {
			  return false;
		  }
		  
		  openMin = Math.max(openMin, 0);
	  }
	  
	  return openMin == 0;
	  
  }
   
   public static void main(String[] args) {
	  
	  String S = "(*)";
	  
	  Boolean result = checkValidString(S);
	  
	  
	  
   }

}
