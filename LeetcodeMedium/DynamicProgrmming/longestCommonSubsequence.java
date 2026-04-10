package DynamicProgrmming;

import java.util.Arrays;
public class longestCommonSubsequence {

  public static int commonSub(String S1, String S2) {
	 
	  int n1 = S1.length();
	  int n2 = S2.length();
	  
	  int[][] dp = new int[n1 + 1][n2 + 1];
	  
	  for(int i = 1; i <= n1; i++) {
		  for(int j = 1; j <= n2; j++) {
			   if(S1.charAt(i - 1) == S2.charAt(j - 1) ) {
				  dp[i][j] = 1 + dp[i - 1][j - 1];
			   } else {
				   dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			   }
		  }
	  }
	   System.out.println("dp result " + Arrays.deepToString(dp));
	   return dp[n1][n2];
  }

   public static void main(String[] args) {
	  
	   String S1 = "abcde";
	   String S2 =  "ace";
	   
	   int result = commonSub(S1, S2);
	   
	   System.out.println("result " + result);
	   
	   
	  
   }
}
