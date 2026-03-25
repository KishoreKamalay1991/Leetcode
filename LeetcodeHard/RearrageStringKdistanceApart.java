import java.util.*;

public class RearrageStringKdistanceApart {

public static String rearrangeString(String s, int k) {
	
	HashMap<Character, Integer> mp = new HashMap();
	
	for(int i = 0; i < s.length(); i++) {
		if(mp.containsKey(s.charAt(i))) {
			mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
		} else {
			mp.put(s.charAt(i), 1);
		}
	}
	
	PriorityQueue<Map.Entry<Character, Integer>> pmap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
	
	pmap.addAll(mp.entrySet());
	
	
	
	Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();
	StringBuilder result = new StringBuilder();
	
	while(!pmap.isEmpty()) {
		Map.Entry<Character, Integer> current = pmap.poll();
		result.append(current.getKey());
		
		current.setValue(current.getValue() - 1);
		waitQueue.offer(current);
		
		System.out.println(waitQueue);
		
		if (waitQueue.size() >= k) {
			Map.Entry<Character, Integer> front = waitQueue.poll();
			System.out.println("front " + front);
			if (front.getValue() > 0) {
				pmap.offer(front);
			}
		 
		}
		
	}
	
	
	return result.length() == s.length() ? result.toString() : "";
	
	
	
	
}
   
   public static void main(String[] args) {
	
	 String s = "aaabbbccc";
	 
	 int k = 3;
	 
	  
	  String result = rearrangeString(s, k);
	  
   }

}
