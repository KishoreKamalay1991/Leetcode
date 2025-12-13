import java.util.ArrayList;
import java.util.List;

public class findAllsubsets {

    public static List<List<Integer>>  subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        System.out.println("start: " + start);
        System.out.println("current: " + current);

        // Add the current subset (make a copy)
        result.add(new ArrayList<>(current));

        // Explore further elements to include
        for (int i = start; i < nums.length; i++) {
            // Choose
            current.add(nums[i]);

            // Recurse with next index
            backtrack(nums, i + 1, current, result);

            // Backtrack (undo the choice)
            System.out.println("Hello: " );
            current.remove(current.size() - 1);
            System.out.println("help"+ current);
        }
        //System.out.println("outside hellp");
    }


    public static void main(String[] args) {

        List<List<Integer>> lists = subsets(new int[]{1, 2, 3});




    }
}