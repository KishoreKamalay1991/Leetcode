public class findfirstandlast {

  public static int firstIndex(int[] nums, int target) {
	 
	  int left = 0;
	  int right = nums.length - 1;
	  int index = -1;
	  
	  while(left <= right) {
		  int mid = left + (right - left) / 2;
		  if(nums[mid] == target) {
			 index = mid;
			 right = mid - 1;
		  } else if(nums[mid] > target) {
			 right = mid -1;
		  } else {
			  left = mid + 1;
		  }
	  }
	  return index;
  }
  
  public static int lastIndex(int[] nums, int target) {
	  
	  int left = 0;
	  int right = nums.length - 1;
	  int index = -1;
	  
	  while(left <= right) {
		  int mid = left + (right - left) / 2;
		  if(nums[mid] == target) {
			 index = mid;
			 left = mid + 1;
		  } else if(nums[mid] > target) {
			  right = mid - 1;
		  } else {
			  left = mid + 1;
		  }
		 
	  }
	  return index;
  }

   public static void main(String[] args) {
	   int[] nums = {5,7,7,8,8,10};
       int target = 8;
	   
	   int firstIndex = firstIndex(nums, target);
	   int secondIndex = lastIndex(nums, target);
	   
   }

}
