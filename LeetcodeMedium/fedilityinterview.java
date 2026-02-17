import java.util.Arrays;

public class fedilityinterview {

    public static int solve(int N, int x, int y, int z) {
        
        int[] dp = new int[N + 1];
        
        for(int i = 0; i <= N; i++) {
             dp[i] = -1;
        }
        dp[0] = 0;
        int j = 1;
        while(j <= N) {
            
            if(j - x >= 0 && dp[j - x] != -1) {
               dp[j] = Math.max(dp[j], dp[j - x] + 1);
            }
            
            if(j - y >= 0 && dp[j - y] != -1) {
                dp[j] = Math.max(dp[j], dp[j - y] + 1);
            }
            
            if(j - z >= 0 && dp[j - z] != -1) {
                dp[j] = Math.max(dp[j], dp[j - z] + 1);
            }
            j++;
            System.out.println(Arrays.toString(dp));
        }
  
        
        return dp[N];
        
        
    }
    public static void main(String[] args) {
        int result = solve(7,5,2,2);
        System.out.println("result " + result);
        
    }
}
