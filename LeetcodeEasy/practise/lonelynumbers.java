package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lonelynumbers {

    public static List<Integer> alllonely(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> allnums = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> each : map.entrySet()) {
            if(each.getValue() != 1) {
                if(!map.containsKey(each.getValue() + 1)  && !map.containsKey(each.getValue() - 1)){
                      allnums.add(each.getValue());
                }
            }
        }

        return allnums;

    }

    public static void main(String[] args) {

        int[] nums = {10,6,5,8};

        List<Integer> alllist = alllonely(nums);

    }

}
