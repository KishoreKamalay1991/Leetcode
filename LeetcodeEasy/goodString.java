public class goodString {

 public static Boolean isGoodString(String str) {
	
	 int[] count = new int[26];
	 
	 char[] chars = str.toCharArray();
	 
	 for(char c : chars) {
		 count[c - 'a']++;
	 }
	 
	  int frequency = 0;
	  for(int i  = 0; i < count.length; i++)  {
		  if(count[i] != 0) {
			  if(frequency == 0) {
				  frequency = count[i];
			  } else if(frequency != count[i]) {
				 return false;
			  }
		  }
	  }
	 
	return true;
 }

public static void main(String[] args) {
	 
	 String str = "aabbccddee";

	Boolean isGoodString = isGoodString(str);

}

}
