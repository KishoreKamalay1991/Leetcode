public class wiggleSubsequence {

  public static int wiggle(int[] nums) {
	  
	  if(nums.length < 2) {
		  return nums.length;
	  }
	  
	  int increase =  1;
	  int decrease = 1;
	  
	  for(int i = 1; i < nums.length; i++) {
		   if(nums[i] > nums[i - 1]) {
			   increase = decrease + 1;
		   } else if(nums[i] < nums[i - 1]){
			   decrease = increase + 1;
		   }
	  }
	  return Math.max(increase, decrease);
	 
  }
   
   public static void main(String[] args) {
	  
	   int [] nums = {1,7,4,9,2,5};
	   
	   int[] nums1 = {1,2,3,4,5,6, 7};
	   
	   //int result =  wiggle(nums);
	   
	   int result1 = wiggle(nums);
	  
   }
 
}
