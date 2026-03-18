import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class lengthoflongestwithdistinctcharacters {

   public static int longstr(String s) {
	   
	   int left = 0;
	   int right = 0;
	   int maxlen = 0;
	   
	  Map<Character, Integer> map = new HashMap<>();
	  
	  while(right < s.length()) {
		  map.put(s.charAt(right), right);
		  if(map.size() == 3) {
			 int smallindex  = Collections.min(map.values());
			 map.remove(s.charAt(smallindex));
			 left = smallindex + 1;
		  }
		  maxlen = Math.max(maxlen, right - left + 1);
		  right++;
	  }
	  
	   return maxlen;
   }

   
   
    public static void main(String[] args) {
		
		String s = "ccaabbb";
		
		int result = longstr(s);
		
	}
 
}
