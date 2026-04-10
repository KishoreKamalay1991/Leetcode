package practise;

public class recursion {

public static void recursion(int num) {
	
	if(num == 0 ) {
		 return;
	}
	System.out.println(num);
	recursion(num - 1);
	
	
}

  public static void main(String[] args) {
	  int i = 10;
	  recursion(i);
  }

}
