package practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class interview {
   public static void main(String[] args) {
	   
	   List<String> list1 = List.of("kishore", "kamalay", "preetam", "shashak", "King");
	   
	   List<String> result = list1.stream().filter(s -> s.startsWith("k")).collect(Collectors.toList());
	   
	   String[] res = result.toArray(new String[0]);
	   
	   System.out.println(Arrays.toString(res));
	   
	   
	   
   }
}
