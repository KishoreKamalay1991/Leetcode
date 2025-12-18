public class minimuminrotatedsortedarray {

    public static  int minimumrotatedsortedarray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }

        while(start < end) {

            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid  + 1]) {
                return nums[mid + 1];
            } else if(nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            if(nums[mid] < nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {

      int[] nums = {3,4,5,1,2};

      int result = minimumrotatedsortedarray(nums);

      System.out.println("result " + result);

    }

}
