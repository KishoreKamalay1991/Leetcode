import java.util.ArrayList;
import java.util.List;

public class subset2 {

  public static List<List<Integer>> subsetList(int[] nums) {
	 
	  List<List<Integer>> res = new ArrayList<>();
	  List<Integer> path = new ArrayList<>();
	  backtrack(res, path, nums, 0);
	  return res;
  }
  
  public static void backtrack(List<List<Integer>> result, List<Integer> path, int[] nums, int start) {
	 
	  result.add(path);
	  
	
	  
	  for(int i = start; i < nums.length; i++) {
		  if(i > start && nums[i] == nums[i - 1])
			  continue;
		  path.add(nums[i]);
		  backtrack(result, path, nums, i + 1);
		  path.remove(path.size() - 1);
		 
	  }
	  
  }

public static void main(String[] args) {
	
	int[] nums = {1,2,2};

	List<List<Integer>> result =  subsetList(nums);
	
	

}

}
