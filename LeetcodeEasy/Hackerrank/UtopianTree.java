package Hackerrank;


public class UtopianTree {

public static int utopian(int n) {
	
	int height = 1;
	int[] arr = new int[n + 1];
	
	arr[0] = 1;
	
	for(int i = 1; i <= n; i++) {
		if(i % 2 == 0) {
			arr[i] = arr[i - 1] + 1;
		} else {
			arr[i] = arr[i - 1] * 2;
		}
	}
	
	return arr[n];
	
}

   public static void main(String[] args) {
	  
	   int n = 5;
	   
	  int result = utopian(n);
	  
	  System.out.println("RESULT " + result);
	  
	  
   }
 
}
