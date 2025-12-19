public class removeduplicateelementsfromsortedarray {

    public static int removeduplicate(int[] nums){

        if(nums.length == 0) {
            return 0;
        }

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {


        int[] nums = {1,2,3,4,4,5,6,7,8,9,10};

        int result = removeduplicate(nums);





    }

}
