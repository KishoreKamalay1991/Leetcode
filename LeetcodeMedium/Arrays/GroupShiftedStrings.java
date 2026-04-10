package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupShiftedStrings {

public static List<List<String>> groupStrings(String[] strings) {
	
	HashMap<String, List<String> > map = new HashMap();
	
	for(String str : strings) {
		String key = getResult(str);
		if(!map.containsKey(key)) {
			map.put(key, new ArrayList<String>());
		}
		map.get(key).add(str);
	}
	return new ArrayList<>(map.values());
}

public static String getResult(String str) {
	
	if(str.length() == 1) {
		return "";
	}
	
	StringBuilder key = new StringBuilder();
	
	for(int i = 1; i < str.length(); i++) {
		int diff = str.charAt(i) - str.charAt(i - 1);
		if(diff < 0) {
			diff = diff + 26;
		}
		key.append(diff).append("#");
	}
	return  key.toString();
	
}
   
   public static void main(String[] args) {
	  
	  String [] str = {"abc","bcd","acef","xyz","az","ba","a","z"};
	  
	  List<List<String>> result = groupStrings(str);
	  
	  
	  
   }


}
