package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topkfreq {

public static int[] topKfrequentElements(int[] nums, int k) {
	
	Map<Integer, Integer> map = new HashMap<>();
	
	for(int i = 0; i < nums.length; i++) {
		 if(map.containsKey(nums[i])) {
			 map.put(nums[i], map.get(nums[i]) + 1);
		 } else {
			 map.put(nums[i], 1);
		 }
	}
	
	PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
	pq.addAll(map.entrySet());
	
	int[] result = new int[k];
	
	for(int i = 0; i < k; i++) {
		result[i] = pq.poll().getKey();
	}
	
	return result;
	
	
	
}

public static void main(String[] args) {
	
	int[] nums = {1,2,1,2,1,2,3,3,2};
	
	int k1 = 2;
	
	int[] res = topKfrequentElements(nums, k1);
	
	
}
}
