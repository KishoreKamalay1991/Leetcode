
import java.util.ArrayList;
import java.util.List;

public class subsets {

  public static List<List<Integer>> subsets(int[] arr) {
	  
	  List<List<Integer>> result = new ArrayList<>();

	  int start = 0;
	  
	  backtrack(0, arr, new ArrayList<>(), result);
	  
	  return result;
  }
  
  public static void backtrack(int index, int[] nums, List<Integer> curr, List<List<Integer>> result) {
	  result.add(new ArrayList<>(curr));
	  for(int i = index; i < nums.length; i++) {
		 curr.add(nums[i]);
		 backtrack(i+1, nums, curr, result);
		 curr.remove(curr.size() - 1);
	  }
	 
  }

public static void main(String[] args) {

	int[] arr = {1,2,3,4};
	
	List<List<Integer>> result = subsets(arr);
	
	System.out.println(result.toString());
	

}

}
