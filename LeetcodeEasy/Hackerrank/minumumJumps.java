package Hackerrank;

public class minumumJumps {
   public static int minJumps(int[] arr) {
	  
	   int jumps = 0;
	   int i = 0;
	   
	  while(i < arr.length - 1) {
		  if(i + 2 < arr.length  && arr[i + 2] != 1 ) {
			  i = i + 2;
		  } else {
			  i = i + 1;
		  }
		  jumps++;
	  }
	   
	   return jumps;
}
   public static void main(String[] args) {
	  
	   int[] arr = {0, 0, 1, 0, 0, 1, 0 };
	   
	   int result = minJumps(arr);
	   
	   System.out.println("result " + result);
	  
   }
}
