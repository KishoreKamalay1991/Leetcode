import java.util.ArrayList;
import java.util.List;

public class findallnumbersdisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        // Step 1: Mark visited numbers
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            System.out.println("index " + index);
            System.out.println(nums[index]);
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);

        }

        // Step 2: Collect missing numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = findDisappearedNumbers(nums);


    }

}
