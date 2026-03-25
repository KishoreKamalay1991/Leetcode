import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFloodinCity {

public static int[] avoidFlood(int[] rains) {
	
	int[] answer = new int[rains.length];
	
	Arrays.fill(answer, 1);
	
	TreeSet<Integer> st = new TreeSet<Integer>();
	
	Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
	
	for(int i = 0; i < rains.length; i++) {
		if(rains[i] == 0) {
			st.add(i);
		} else {
			answer[i] = -1;
			if(mp.containsKey(rains[i])) {
				System.out.println(mp.get(rains[i]));
				System.out.println(st.ceiling(mp.get(rains[i])));
				Integer it = st.ceiling(mp.get(rains[i]));
				if(it == null) {
					return new int[0];
				}
				answer[it] = rains[i];
				st.remove(it);
			}
			mp.put(rains[i], i);
		}
	}
	
	return answer;
	
	
	
}

  public static void main(String[] args) {
	
	int[] rains = {1,2,0,0,2,1};
	 
	int[] result = avoidFlood(rains);
	 
	 
  }

}
