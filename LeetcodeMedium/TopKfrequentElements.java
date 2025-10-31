import java.util.*;
import java.util.stream.Collectors;

public class TopKfrequentElements {

    public  static int[] topKfrequentElements(int [] nums, int k1) {


        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // 2) Take top-k by frequency (desc)
        List<Integer> topK = freq.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .limit(k1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // 3) Convert to int[]
        int[] res = new int[topK.size()];
        for (int i = 0; i < topK.size(); i++) res[i] = topK.get(i);
        return res;


    }

    public static void main(String[] args) {

        int[] nums = {1,2,1,2,1,2,3,1,3,2};

        int k1 = 2;

        int[] res = topKfrequentElements(nums, k1);





    }

}
