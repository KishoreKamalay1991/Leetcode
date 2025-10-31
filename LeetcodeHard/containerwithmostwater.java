public class containerwithmostwater {

    // Take maxarea = 0, left = 0 and right as arraylength -1
    // Loop left to right and calculate width

    public static int maxArea(int[] height) {

       
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * minHeight);
            System.out.println("Max Area: " + maxArea);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }
    
}
