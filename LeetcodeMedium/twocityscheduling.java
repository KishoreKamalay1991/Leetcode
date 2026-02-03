import java.util.Arrays;

public class twocityscheduling {

  public static int twocity(int[][] nums) {
	 
	  Arrays.sort(nums, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));
	  
	  System.out.println(Arrays.deepToString(nums));
	  
	  int sum = 0;
	  int len = nums.length / 2;
	  for(int i = 0; i < len; i++) {
		 sum += nums[i][0];
	  }
	  for(int i = len; i < nums.length; i++) {
		  sum += nums[i][1];
	  }
	 
	 return sum;
  }
   public static void main(String[] args) {
	   
	   int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
	   
	   int minimumCost = twocity(costs);
	   
	   System.out.println("minimum cost " + minimumCost);
	  
   }
}
