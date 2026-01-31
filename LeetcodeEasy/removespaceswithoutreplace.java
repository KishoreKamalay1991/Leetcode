public class removespaceswithoutreplace {

  public static String removewhitespaces(String str) {
	 
	  StringBuilder s = new StringBuilder();
	  for(int i = 0; i < str.length(); i++) {
		  if(str.charAt(i) != ' ') {
			  s.append(str.charAt(i));
		  }
	  }
	  return s.toString();
  }

public static void main(String[] args) {

	String str = "a b c d f";
	
	String newStr = removewhitespaces(str);
	
	System.out.println("new Str " + newStr);
	
	

}

}
