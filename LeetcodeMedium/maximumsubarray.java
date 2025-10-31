public class maximumsubarray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            System.out.println("Current Sum: " + currentSum);
            maxSum = Math.max(maxSum, currentSum);
            System.out.println("Max Sum: " + maxSum);
        }

        return maxSum;
    }
    
}
