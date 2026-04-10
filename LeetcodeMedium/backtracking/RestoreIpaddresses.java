package backtracking;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpaddresses {

public static List<String> restoreIpAddresses(String s) {
	List<String> result = new ArrayList();
	
	int start = 0;
	if(s.length() < 4 || s.length() > 12 || s == null) {
		return result;
	}
	
	backtrack(s, 0, 0, new ArrayList<>(), result);
	return result;
	
}

public static void backtrack(String S, int index, int parts, List<String> path, List<String> result) {
	if(parts == 4) {
		if(index == S.length()) {
			result.add(String.join(".", path));
		}
		return;
	}
	
	for(int i = 1; i <= 3; i++) {
		if(index + i > S.length()) {
			break;
		}
		String part = S.substring(index, index + i);
		
		if(part.length() > 1 && part.charAt(0) == '0') {
			continue;
		}
		
		int num = Integer.parseInt(part);
		if(num > 255) {
			continue;
		}
		System.out.println("part value " + part);
		System.out.println("path " + path.toString());
		System.out.println("parts" + parts);
		
		path.add(part);
		backtrack(S, index + i, parts + 1, path, result);
		path.remove(path.size() - 1);
		
	}
	
}
    
    public static void main(String[] args) {
		
		String s = "25525511135";
		
		List<String> result = restoreIpAddresses(s);
	}
 
}
