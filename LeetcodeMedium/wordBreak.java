import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {


public static boolean wordBreak(String s, List<String> wordDict) {
	// Convert list to set for O(1) lookup time
	Set<String> wordSet = new HashSet<>(wordDict);
	int n = s.length();
	
	// dp[i] means s.substring(0, i) can be segmented
	boolean[] dp = new boolean[n + 1];
	
	// Base case: empty string
	dp[0] = true;
	
	// Iterate through the string length
	for (int i = 1; i <= n; i++) {
		// Check all possible split points before i
		for (int j = 0; j < i; j++) {
			// If the prefix is valid AND the remaining suffix is in the dict
			if (dp[j] && wordSet.contains(s.substring(j, i))) {
				dp[i] = true;
				break; // Found a valid way to form s[0...i], move to next i
			}
		}
	}
	
	for(int i = 0; i <= n; i++) {
		System.out.println(dp[i]);
	}
	
	return dp[n];
}

   public static void main(String[] args) {
	   
	  String s = "applepenapple";
	  String[] wordDict1 = {"apple","pen"};
	  
	  List<String> wordDict = Arrays.asList(wordDict1);
	  
	  Boolean res = wordBreak(s, wordDict);
	  
   }

}
