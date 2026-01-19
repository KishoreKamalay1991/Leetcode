public class findthewiunnerofanarraygame {

public static int getwinner(int[] nums, int k) {
	
	int currentMax = nums[0];
	int count = 0;
	
	for(int i = 1; i < nums.length; i++) {
		
		if(nums[i] > currentMax) {
			currentMax = nums[i];
			count = 1;
		}
		
		else {
			count++;
		}
		
		if (count == k) {
			return currentMax;
		}
	}
	
	return currentMax;
	
}

public static void main(String[] args) {
	
	int[] arr = {2,1,3,5,4,6,7};
	
	int k = 2;
	
	int result = getwinner(arr, k);
	

}

}
