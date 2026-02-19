import java.util.Stack;

public class simplypath {

public static String simplifyPath(String path) {
	
	Stack<String> res = new Stack();
	
	String[] parts = path.split("/");
	
	
	
	for(String str : parts) {
		if(str.equals("") || str.equals(".") ) {
			continue;
		}
		
		if(str.equals("..")) {
			if(!res.isEmpty()) {
				res.pop();
			}
		} else {
			res.push(str);
		}
	}
	
	if(res.isEmpty()) {
		return "/";
	}
	
	StringBuilder result = new StringBuilder();
	
	for(String str : res) {
		result.append("/").append(str);
	}
	
	return result.toString();
	
	
}

public static void main(String[] args) {
	
	String path = "/home/user/Documents/../Pictures";
	
	String result = simplifyPath(path);
	
	System.out.println("result " + result);
	
}

}
