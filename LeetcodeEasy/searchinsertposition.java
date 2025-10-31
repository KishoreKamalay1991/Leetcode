public class searchinsertposition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; // the correct insertion point
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // Output: 2
        System.out.println(searchInsert(nums, 2)); // Output: 1
        System.out.println(searchInsert(nums, 7));
        System.out.println(searchInsert(nums, 6));// Output: 4
    }
}
