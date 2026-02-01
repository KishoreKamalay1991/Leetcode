import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsumwithoutusingsamenum {

  public static List<List<Integer>> combinationsum(int[] nums, int target) {
	  Arrays.sort(nums);
	  List<List<Integer>> result = new ArrayList<>();
	 
	  backtrack(result, new ArrayList<>(), nums, target, 0);
	 return result;
  }
  
  public static void backtrack(List<List<Integer>> result, List<Integer> path, int[] nums, int target, int start ) {
	 if(target == 0) {
		 result.add(new ArrayList(path));
		 return;
	 }
	 
	 for(int i = start; i < nums.length; i++) {
		 if(target < nums[i]) {
			 break;
		 }
		 if(i > start && nums[i] == nums[i - 1 ]) {
			 continue;
		 }
		 path.add(nums[i]);
		 backtrack(result, path, nums, target - nums[i], i + 1);
		 path.remove(path.size() - 1);
	 }
	 
  }
    
    public static void main(String[] args) {
		
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		
		List<List<Integer>> result = combinationsum(candidates, target);
		System.out.println(result);
	}

}
