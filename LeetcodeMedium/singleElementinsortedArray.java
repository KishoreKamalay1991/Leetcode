public class singleElementinsortedArray {

    public static int singleElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[mid + 1]) {
              mid = mid - 1;
            }

            int leftparlen = (mid - left) + 1;

            if (leftparlen % 2 == 1 ) {
                right = mid;
            }
            else {
                left = mid + 1;
            }

        }

        return nums[left];
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,5,5};

        int singleElement = singleElement(arr);

        System.out.println("single element is  " + singleElement);


    }

}
