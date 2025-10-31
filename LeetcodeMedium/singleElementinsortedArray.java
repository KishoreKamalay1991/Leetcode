public class singleElementinsortedArray {

    public static int singleElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == mid) {

            }

        }


        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,5,5};

        int singleElement = singleElement(arr);


    }

}
