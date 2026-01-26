public class Maximumnumbervovelsinsubstring {

  public static int maxvovwls(String s, int k) {
	  
	  int currentcount = 0;
	  int maxcount = 0;
	  String vovels = "aeiou";
	 
	 for (int i = 0; i < k; i++) {
		 
		 if (vovels.indexOf(s.charAt(i)) != -1) {
			 currentcount++;
		 }
	 }
	    maxcount = currentcount;
		for(int i = k; i < s.length(); i++) {
		
		  if(vovels.indexOf(s.charAt(i)) != -1) {
			 currentcount++;
		}
		
		 if(vovels.indexOf(s.charAt(i - k)) != -1) {
			currentcount--;
		 }
		 
		 maxcount = Math.max( maxcount, currentcount);
		 
		 if(maxcount == k) {
			 return k;
		 }
		
		
	 }
	 
	 return maxcount;
	 
  }

    public static void main(String[] args) {
		
		
		int max = 3;
		String s = "abciiidef";
		int maxvovels = maxvovwls(s, max);
		
		
		
		
	}

}
