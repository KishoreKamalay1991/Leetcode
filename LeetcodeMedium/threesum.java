import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threesum {

    public static  ArrayList<ArrayList<Integer>> pair_sum_sorted_all_pairs(ArrayList<Integer> nums, int start, int target) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        int left = start;
        int right = nums.size() - 1;
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(nums.get(left));
                pair.add(nums.get(right));
                pairs.add(pair);
                left += 1;
                // To avoid duplicate '[b, c]' pairs, skip 'b' if it’s the same as the
                // previous number.
                while (left < right && nums.get(left).equals(nums.get(left - 1))) {
                    left += 1;
                }
            } else if (sum < target) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return pairs;
        }



    public static List<ArrayList<Integer>> pairedsum(int[] nums) {

        List<ArrayList<Integer>> result = new ArrayList<>();

        ArrayList<Integer> numlist = new ArrayList<Integer>();

        for (int element : nums) {
            numlist.add(element); // Auto-boxing occurs here
        }

        Collections.sort(numlist);

        for(int i = 0; i < numlist.size(); i++) {

            // Optimization: triplets consisting of only positive numbers will never sum
            // to 0.
            if(numlist.get(i) > 0) {
                break;
            }
            // To avoid duplicate triplets, skip 'a' if it's the same as the previous
            // number.
            if(i > 0 && numlist.get(i).equals(numlist.get(i - 1))) {
                continue;
            }

            // Find all pairs that sum to a target of '-a' ('-nums[i]').
            ArrayList<ArrayList<Integer>> pairs = pair_sum_sorted_all_pairs(numlist, i + 1, -numlist.get(i));
            for (ArrayList<Integer> pair : pairs) {
                ArrayList<Integer> triplet = new ArrayList<>();
                triplet.add(numlist.get(i));
                triplet.addAll(pair);
                result.add(triplet);
            }
        }
        return result;

    }




    public static void main(String[] args) {


        int[] nums = {-1,0,1,2,-1,-4};

        List<ArrayList<Integer>> result = pairedsum(nums);



    }

}
