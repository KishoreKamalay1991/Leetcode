import java.util.HashMap;

public class twosum {

    public static void main(String[] args) {
        int[] nums = {4, 11, 9, 9, 4, 6};
        int target = 10;

        int[] result = findTwoSum(nums, target);
        System.out.println(result);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            System.out.println(map.entrySet());
            map.put(nums[i], i);
        }

        return null; // No solution found
    }
}
