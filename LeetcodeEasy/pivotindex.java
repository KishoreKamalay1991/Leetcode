public class pivotindex {

    public static int pivoteindex(int[] nums) {

        int totalcount = 0;

        for(int i = 0; i < nums.length; i++) {
           totalcount += nums[i];
        }

        int leftcount = 0;
        int rightcount = 0;

        for(int i = 0; i < nums.length; i++) {

            rightcount = totalcount - leftcount - nums[i];
            if (rightcount == leftcount) {
               return i;
            }

            leftcount += nums[i];

        }

        return -1;


    }

    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        int result = pivoteindex(nums);



    }

}
