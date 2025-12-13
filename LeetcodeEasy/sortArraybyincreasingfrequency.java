import java.util.*;

public class sortArraybyincreasingfrequency {

    public static int[] incfreq(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] res = new int[arr.length];

        for(int ele : arr) {
            if (map.containsKey(ele))  {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }

        }
        List<Integer> keys = new ArrayList<Integer>(map.keySet());
        Collections.sort(keys, (a,b) -> {
           if(map.get(a) == map.get(b)) {
               return b - a;
           }
           else {
               return map.get(a) - map.get(b);
           }
        });
        int index = 0;
        for (int num : keys) {
            for (int i = 0; i < map.get(num); i++) {
                res[index] = num;
                index++;
            }

        }

        System.out.println(Arrays.toString(res));

      return res;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,2,3,4};

        incfreq(nums);

    }

}
