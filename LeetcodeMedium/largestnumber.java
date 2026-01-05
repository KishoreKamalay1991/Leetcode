import java.util.Arrays;

public class largestnumber {

    public static String result(int[] nums) {

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if largest is "0", result is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build result
        String sb = "";
        for (String s : arr) {
            sb += s;
        }

        return sb;



    }

    public static void  main(String[] args) {

        int[] nums = { 10, 2 };

         String result = result(nums);



    }


}
