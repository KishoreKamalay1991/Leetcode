import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> majoritymap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (majoritymap.containsKey(nums[i])) {
                majoritymap.put(nums[i], majoritymap.get(nums[i]) + 1);
            } else {
                majoritymap.put(nums[i], 1);
            }
        }

        System.out.println("majority element: " + majoritymap.entrySet());

        int majority = (nums.length / 2);
        int result = 0;

        for(Map.Entry<Integer, Integer> entry : majoritymap.entrySet()) {

            if (entry.getValue() > majority) {
                result  = entry.getKey();
            }

        }


       return result;
    }

    public static void main(String[] args) {

        int [] arr = {3,2,3};

       int majorityElement = majorityElement(arr);
        System.out.println(majorityElement);


    }

}
