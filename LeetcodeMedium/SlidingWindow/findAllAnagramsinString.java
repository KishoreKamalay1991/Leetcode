package SlidingWindow;

import java.lang.reflect.Array;
import java.util.*;
public class findAllAnagramsinString {

public static List<Integer> findAnagrams(String s, String p) {
	
	List<Integer> result = new ArrayList<>();
	
	if(p.length() > s.length()) {
		return result;
	}
	
	int[] pCount = new int[26];
	int[] sCount = new int[26];
	
	for (char c : p.toCharArray()) {
		pCount[c - 'a']++;
	}
	
	int windowSize = p.length();
	
	System.out.println("pcount" + Arrays.toString(pCount));
	
	for(int i = 0; i < s.length(); i++) {
		sCount[s.charAt(i) - 'a']++;
		
		if (i >= windowSize) {
			sCount[s.charAt(i - windowSize) - 'a']--;
		}
		System.out.println("scount" + Arrays.toString(sCount));
		
		if (Arrays.equals(pCount, sCount)) {
			result.add(i - windowSize + 1);
		}
		
	}
	
  return result;
}
   
     public static void main(String[] args) {
		 
		String s = "cbaebabacd";
		String p = "abc";
		
		List<Integer> results = findAnagrams(s, p);
		 
	 }
  
}
