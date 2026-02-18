import java.util.Arrays;

public class minimumWindowSubstring {

   public static String minwindowsunstr(String s, String t) {
	    if(s.length() < t.length()) {
			return "";
		}
		
		int[] target = new int[128];
		// Take character count for String t.
		for(char c : t.toCharArray()) {
			target[c]++;
		}
		
		int left = 0;
		int right = 0;
		int startIdx = 0;
		int minLen = Integer.MAX_VALUE;
		int count = t.length();
		
		System.out.println(Arrays.toString(target));
		
		while(right < s.length()) {
			// If character at right is needed, decrease count
			if(target[s.charAt(right)] > 0) {
				count--;
			}
			// Decrease the target frequency
			target[s.charAt(right)]--;
			System.out.println(Arrays.toString(target));
			right++;
			
			// If count == 0 calculate the minimum length.
			while(count == 0) {
				if(right - left < minLen) {
				    minLen = right - left;
					startIdx = left;
				}
				target[s.charAt(left)]++;
				if(target[s.charAt(left)] > 0) {
					count++;
				}
				left++;
			}
			
		}
   
	    return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
   }
   
    public static void main(String[] args) {
		
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		String result = minwindowsunstr(s, t);
		System.out.println("result " + result);
		
	}
 
}
