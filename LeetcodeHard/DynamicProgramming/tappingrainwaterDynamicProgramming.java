package DynamicProgramming;

import java.util.Arrays;

public class tappingrainwaterDynamicProgramming {

   public static int maxWater(int[] height) {
	   
	   int maxWater = 0;
	   int size = height.length;
	   
	   int[] left_array = new int[size];
	   int[] right_array = new int[size];
	   
	   left_array[0] = height[0];
	   
	   for(int i = 1; i < size - 1; i++) {
		   left_array[i] = Math.max(height[i], left_array[i-1]);
	   }
	   
	   System.out.println(Arrays.toString(left_array));
	   
	   
	   right_array[size- 1] =  height[size - 1];
	   
	   for(int j = size - 2; j >= 0; j--) {
		   right_array[j] = Math.max(height[j], right_array[j + 1]);
	   }
	   
	  
	   System.out.println(Arrays.toString(right_array));
	   
	   for(int i = 1; i < size - 1; i++) {
		    maxWater = maxWater + (Math.min(left_array[i], right_array[i]) - height[i]);
	   }
	   
	   
	   
	   return maxWater;
   }
    
    public static void main(String[] args) {
		
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
  
		int result = maxWater(height);
		
		System.out.println(result);
		
	}

}
