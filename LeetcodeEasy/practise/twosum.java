package practise;

import java.util.HashMap;
import java.util.Map;

public class twosum {

public static int[] findTwoSum(int[] nums, int target) {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int i = 0; i < nums.length; i++) {
		
		int comp = target - nums[i];
		
		if(map.containsKey(comp)) {
			return new int[] {map.get(comp), i};
		}
		
		map.put(nums[i], i);
		
	
	}
	
	return new int[] {-1 ,-1};

}
 

  public static void main(String[] args) {
	  
	  int[] nums = {4, 11, 9, 9, 4, 6};
	  int target = 10;
	  
	  int[] result = findTwoSum(nums, target);
	  System.out.println(result[0]);
	  System.out.println(result[1]);
	 
  }

}
