import java.util.Arrays;

public class Decodeways {

public static int numDecodings(String s) {
	if(s == null || s.length() == 0 || s.charAt(0) == '0') {
		return 0;
	}
	
	int n = s.length();
	int[] dp = new int[n + 1];
	
	dp[0] = 1;
	dp[1] = 1;
	
	for(int i = 2; i <= n; i++) {
		int oneDigit = Integer.parseInt(s.substring(i - 1, i));
		System.out.println("oneDigit " + oneDigit);
		if(oneDigit >= 1 && oneDigit <= 9) {
			dp[i] = dp[i] + dp[i - 1] ;
		}
		System.out.println(Arrays.toString(dp));
		
		int twoDigits = Integer.parseInt(s.substring(i - 2, i));
		System.out.println("secondDigit " + twoDigits);
		if(twoDigits >= 10 && twoDigits <= 26) {
			dp[i] = dp[i] + dp[i -2];
		}
		System.out.println(Arrays.toString(dp));
		
	}
	
	return dp[n];
	
}
   
    public static void main(String[] args) {
		
		
		String num = "11106";
		
		numDecodings(num);
		
	}
 
}
