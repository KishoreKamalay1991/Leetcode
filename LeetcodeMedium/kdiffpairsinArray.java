import java.util.HashMap;
import java.util.Set;

public class kdiffpairsinArray {

    public static int findpairs(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int count = 0;
        Set<Integer> set = map.keySet();

        for(int num : set) {
            if(k > 0 && map.containsKey(num + k)) {
                count++;
            }

            if(k == 0 && map.get(num) > 1) {
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {

        int[] nums = {3,1,4,1,5};

        int k = 2;

       int result = findpairs(nums, k);

       System.out.println(result);

    }


}
