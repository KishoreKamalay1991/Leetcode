

public class RemoveElement {

    public static int  removeElement(int[] nums, int val) {
        int k = 0; // index to place next valid element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};

        int val = 3;

        int abc = removeElement(arr, val);

        System.out.println("abc" + abc);

        

    }
    
}
