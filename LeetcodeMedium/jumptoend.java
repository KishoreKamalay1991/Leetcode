public class jumptoend {

    public static Boolean jump(int[] nums) {

        int lastelement = nums.length - 1;

        for(int i = nums.length - 2; i >=0; i--) {

            if(i + nums[i] >= lastelement) {
               lastelement = i;
            }

        }

        return lastelement == 0;

    }
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};

       Boolean result = jump(nums);

    }

}
