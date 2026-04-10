package practise;

public class fibanucci {

  public static int fibseries(int n) {
	  
	  if( n == 1) {
		  return 1;
	  }
	  
	  if(n == 0) {
		  return 0;
	  }
	  
	  int result = fibseries(n - 1) + fibseries( n - 2);
	  return result;
  }

  public static void main(String[] args) {
	  
	  int n = 4;
	  int res = fibseries(n);
	  System.out.println("res " + res);
  }
}
