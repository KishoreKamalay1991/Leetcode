public class findpeakelement {

    public static int peakelement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            System.out.println("mid value" + mid);

            /*
            * 1. Calculate mid value,  if nums[mid] is greater than muns[mid + 1] make end as mid.
            * 2. lets say we have 1,2,1,3,5,6,4 nums[mid] will be 3 (index 3) therefore start will be 4
            * 3. mid will be 6 i.e mid[6] i.e 3 which is greater than  mid[7] i.e 2 end will be 6
            *  */

            if(nums[mid] > nums[mid + 1]) {
                end = mid;
                System.out.println("end value " + end);
            } else {
              start = mid + 1;
                System.out.println("start value " + start);
            }
        }

        return start;

    }

    public static void main(String[] args) {


        int[] nums = {1,2,1,3,5,6,4};

        int peakelementindex = peakelement(nums);
        System.out.println("peak element index " + peakelementindex);


    }

}
