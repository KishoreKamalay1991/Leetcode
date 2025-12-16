public class Threeconsecutiveodds {


  public static Boolean threeconsecuitive(int[] nums) {
	  
	  int length = 0;
	  
	  for(int i = 0; i < nums.length; i++) {
		 
		  if(nums[i] % 2 == 1) {
			  
			  length++;
			  System.out.println(length);
			 if(length == 3) {
				return true;
			 }
		  }else {
			  length = 0;
		  }
		 
	  }
	  
	  return false;
  }


    public static void main(String[] args) {
	  
	  int[] nums = {1,2,34,3,4,5,7,23,12};
	  
	  Boolean result = threeconsecuitive(nums);
		
	}
 

}
