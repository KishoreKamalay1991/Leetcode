package practise;

import java.util.HashMap;
import java.util.Map;

public class maximumelements {

  public static int majorityElement(int[] arr) {
	 
	  Map<Integer, Integer> majorityMap = new HashMap<>();
	  
	  int res = 0;
	  
	  for(int i = 0; i < arr.length; i++) {
		  if(majorityMap.containsKey(arr[i])) {
			  majorityMap.put(arr[i], majorityMap.get(arr[i]) + 1);
		  } else {
			  majorityMap.put(arr[i], 1);
		  }
	  }
	  
	  int majority = arr.length / 2;
	  
	  for(Map.Entry<Integer, Integer> map : majorityMap.entrySet()) {
		 if(map.getValue() > majority) {
			 res = map.getKey();
		 }
	  }
	  
	  
	  
	  return res;
	  
	  
  }

public static void main(String[] args) {
	int [] arr = {3,2,3};
	
	int majorityElement = majorityElement(arr);
	System.out.println(majorityElement);
}

}
