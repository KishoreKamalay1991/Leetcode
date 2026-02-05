import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class partitionLabels {

  public static List<Integer> partitionLabels(String str) {
	  
	  List<Integer> result = new ArrayList<>();
	  
	  int[] last = new int[26];
	  int start = 0, end = 0;
	  
	  // last index of each character
	  for (int i = 0; i < str.length(); i++) {
		  last[str.charAt(i) - 'a'] = i;
	  }
	  
	  for (int i = 0; i < str.length(); i++) {
		  end = Math.max(end, last[str.charAt(i) - 'a']);
		  if (i == end) {
			  result.add(end - start + 1);
			  start = i + 1;
		  }
	  }
	  
	 System.out.println(Arrays.toString(last));
	 
	 return result;
	 
  }
   public static void main(String[] args) {
	   
	   String str = "ababcbacadefegdehijhklij";
	   
	   List<Integer> result = partitionLabels(str);
	   
	  
   }
}
