package practise;

public class sumofn {
  
  public static int sumofall(int n ) {
   
	  int sum = 0;
	  if(n == 0) {
		  return sum;
	  }
	  sum = n + sumofall(n - 1);
	  return sum;
  }
  public static void main(String[] args) {
	   int n = 10;
	   int sum = sumofall(n);
	   
	   System.out.println("sum " + sum);
  }
}
