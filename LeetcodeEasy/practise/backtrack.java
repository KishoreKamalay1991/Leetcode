package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class backtrack {

  public static void backtracking(int[] nums, int len, List<Integer> out, List<List<Integer>> res1) {
	  
	  res1.add(new ArrayList<>(out));
	  
	  
	  
	  for(int i = len; i < nums.length; i++) {
		  out.add(nums[i]);
		  backtracking(nums, i + 1, out, res1);
		  out.remove(out.size() - 1);
		 
		  
	  }
	  
  }

   public static List<List<Integer>> res(int[] nums) {
	   
	   List<List<Integer>> res1 = new ArrayList<>();
	   
	   
	   backtracking(nums, 0, new ArrayList<>(), res1);
	  
	  return res1;
	  
   }

   public static void main(String[] args) {
	  
	   int[] nums  = {1,2, 3};
	   
	   List<List<Integer>> result = res(nums);
	   
	   for(List<Integer> k : result) {
		   
		   System.out.println("k value " + k.toString());
		   
	   }
	  
   }

}
