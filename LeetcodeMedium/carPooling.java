import java.util.Arrays;

public class carPooling {

	public static boolean carPooling(int[][] trips, int capacity) {
		int[] diff = new int[1001];
		
		for (int[] t : trips) {
			System.out.println(t[0]);
			System.out.println(t[1]);
			System.out.println(t[2]);
			diff[t[1]] = diff[t[1]] + t[0];
			diff[t[2]] = diff[t[2]] - t[0];
		}
		
		System.out.println(Arrays.toString(diff));
		
		int curr = 0;
		for (int x : diff) {
			curr += x;
			if (curr > capacity) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[][] trips = {{2,1,5},{3,3,7}};
		int capacity = 4;
		Boolean result = carPooling(trips, capacity);
		System.out.println(result);
	}

}
