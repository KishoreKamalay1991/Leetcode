
public class MaximumLengthRepeatedSubarray {

    public static int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] dp = new int[n + 1]; // dp[j] represents dp[i][j] for current i
        int ans = 0;

        for (int i = 1; i <= m; i++) {
            // iterate backwards to preserve dp[j-1] from previous row (i-1)
            for (int j = n; j >= 1; j--) {
                System.out.println("nums1 " + nums1[i - 1]);
                System.out.println("nums2 " + nums2[j - 1]);
                if (nums1[i - 1] == nums2[j - 1]) {
                System.out.println("j value " + j);
                System.out.println("dp[j] before " + dp[j]);
                    System.out.println("dp[j-1] before " + dp[j - 1]);
                    dp[j] = dp[j - 1] + 1;
                    System.out.println("dp[j] after " + dp[j]);
                    ans = Math.max(ans, dp[j]);
                } else {
                    dp[j] = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        System.out.println(findLength(nums1, nums2)); // 3 (subarray [3,2,1])
    }
}
