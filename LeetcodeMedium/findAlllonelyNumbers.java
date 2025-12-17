import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAlllonelyNumbers {

    public static List<Integer> alllonely(int[] nums){

        Map<Integer, Integer> lonely = new HashMap<>();
        List<Integer> lonelynums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(lonely.containsKey(nums[i])) {
                lonely.put(nums[i], lonely.get(nums[i]) + 1);
            }
            else{
                lonely.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : lonely.entrySet()) {
            if(entry.getValue() == 1 ) {
                if (lonely.containsKey(entry.getKey() - 1) == false && lonely.containsKey(entry.getKey() + 1) == false) {
                    lonelynums.add(entry.getKey());
                }

            }
        }

        return lonelynums;

    }

    public static void main(String[] args) {

        int[] nums = {10,6,5,8};

        List<Integer> alllist = alllonely(nums);



    }

}
