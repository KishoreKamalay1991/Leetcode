import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {

    public static List<List<Integer>> combinationofsum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, target, 0, new ArrayList<>(), result);
		return result;
	}
	
	public static void backtrack(int[] nums, int remain, int start, List<Integer> path, List<List<Integer>> res) {
		
		System.out.println("start " + start);
		System.out.println("path" + path);
		System.out.println("remain " + remain);
	 
		if(remain == 0) {
			res.add(new ArrayList<>(path));
		    return;
		}
		
		for(int i = start; i < nums.length; i++) {
		    int val = nums[i];
			if(val > remain) {
			   break;
			}
			
			path.add(val);
			backtrack(nums, remain - val, i, path, res);
			path.remove(path.size() - 1);
		}
		
	}

   

    public static void main(String[] args) {
		
		int[] nums = {2,3,6,7};
		int target = 7;
		
		List<List<Integer>> result = combinationofsum(nums, target);
		
		System.out.println("result " + result);
		
		
	}
 

}
