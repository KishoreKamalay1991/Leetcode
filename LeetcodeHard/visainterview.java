 public class visainterview {

public static  int solution(int t, int[] capacity, int[] recharge) {
	int n = capacity.length;
	
	int[] remaining = capacity.clone();   // remaining charge
	int[] availableAt = new int[n];        // time when battery is available
	
	int time = 0;
	int usedBatteries = 0;
	int current = 0;
	
	while (time < t) {
		boolean found = false;
		
		// Try all batteries cyclically
		for (int i = 0; i < n; i++) {
			int idx = (current + i) % n;
			
			// Battery is available and has charge
			if (availableAt[idx] <= time && remaining[idx] > 0) {
				found = true;
				current = idx;
				
				int usable = Math.min(remaining[idx], t - time);
				time += usable;
				remaining[idx] -= usable;
				
				// If fully depleted
				if (remaining[idx] == 0) {
					usedBatteries++;
					availableAt[idx] = time + recharge[idx];
					remaining[idx] = capacity[idx]; // reset for next cycle
				}
				
				current = (idx + 1) % n;
				break;
			}
		}
		
		// No battery available
		if (!found) {
			return -1;
		}
	}
	
	return usedBatteries;
}

public static void main(String[] args) {
	
	int t = 16;
	int[] capacity = {2, 5, 6};
	int[] recharge = {12, 1, 4};
	
	int result = solution(t, capacity, recharge);
	
	System.out.println("result " + result);

}

}

