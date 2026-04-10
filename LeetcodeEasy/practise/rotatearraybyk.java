package practise;

public class rotatearraybyk {
  
  public static void rotate(int[] arr, int d, int n) {
	  
	  d = d % n;
	  
	  reverse(arr, 0, n - 1 );
	  reverse(arr, 0, n - d - 1);
	  reverse(arr, n - d, n - 1);
	  
  }
  
  public static void reverse(int[] arr, int start, int end) {
	 while(start < end) {
		 int temp = arr[start];
		 arr[start] = arr[end];
		 arr[end] = temp;
		 start++;
		 end--;
	 }
  }
  
  
  public static void main(String[] args) {
	  
	  int arr[] = {1, 2, 3, 4, 5, 6, 7};
	  int d = 3;
	  int n = arr.length;
	  
	  rotate(arr, d, n);
	  
	  System.out.print("Rotated array: ");
	  for (int i = 0; i < n; i++) {
		  System.out.print(arr[i] + " ");
	  }
	 
  }
}
