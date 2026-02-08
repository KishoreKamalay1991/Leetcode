import java.util.Arrays;

public class NonOverlappingIntervals {

   public static int nonoverlap(int[][] nums) {
	   if(nums.length == 0) {
		  return 0;
	   }
	   
	   Arrays.sort(nums, (a, b) -> a[1] - b[1]);
	   
	   int k  = nums[0][1];
	   int totalcount = 0;
	   
	   for(int i = 0; i < nums.length; i++) {
		   if(nums[i][1] < k) {
			   totalcount++;
		   } else {
			   k = nums[i][1];
		   }
	   }
	   
	   
	   
	   return totalcount;
   }
   public static void main(String[] args) {
	  
	   int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
	   
	   int result = nonoverlap(intervals);
   }
}
