import java.util.Arrays;

public class taprainwater {
public static int trap(int[] height) {
	if (height == null || height.length == 0) {
		return 0;
	}
	
	int n = height.length;
	int[] leftMax = new int[n];
	int[] rightMax = new int[n];
	int totalWater = 0;
	
	// Step 1: Fill leftMax array
	leftMax[0] = height[0];
	for (int i = 1; i < n; i++) {
		leftMax[i] = Math.max(height[i], leftMax[i - 1]);
	}
	
	System.out.println(Arrays.toString(leftMax));
	// Step 2: Fill rightMax array
	rightMax[n - 1] = height[n - 1];
	for (int i = n - 2; i >= 0; i--) {
		rightMax[i] = Math.max(height[i], rightMax[i + 1]);
	}
	System.out.println(Arrays.toString(rightMax));
	// Step 3: Calculate trapped water at each index
	for (int i = 0; i < n; i++) {
		// Water = min(left boundary, right boundary) - current height
		totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
	}
	
	return totalWater;
}

public static void main(String[] args) {
	int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
	
	int result = trap(height);
}

}