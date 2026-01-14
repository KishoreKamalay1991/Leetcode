package prefixsum;

public class sumbetweenrange {

    public static int betweenrange(int[] arr, int start, int end) {
		
		int res = arr[end] - arr[start - 1];
		
		return res;
		
	}

    public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int s = 2;
		int k = 5;
		
		int[] result = new int[arr.length];
		
		result[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			result[i] = arr[i] + result[i - 1];
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println("res " + result[i]);
		}
		
		int sumresult = betweenrange(result, s, k);
		
		System.out.println("sum result " + sumresult);
		
		
		
	}
 
}
