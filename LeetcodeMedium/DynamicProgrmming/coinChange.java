package DynamicProgrmming;

public class coinChange {

public static int coinChange(int[] coins, int amount) {
	if(amount < 0) {
		return 0;
	}
	int result = helper(coins, amount, new int[amount]);
	return result;
}

public static int helper(int[] coins, int amount, int[] count) {
	if(amount == 0) {
		return 0;
	}
	if(amount < 0) {
		return -1;
	}
	
	if(count[amount - 1] != 0) {
		return count[amount - 1];
	}
	
	int min = Integer.MAX_VALUE;
	
	for(int coin : coins) {
		int result = helper(coins, amount - coin, count);
		
		
		if(result >= 0 && result < min) {
			System.out.println("result " + result);
			min = result + 1;
		}
	}
	count[amount - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
	return count[amount - 1];
}
  
  public static void main(String[] args) {
	  
	  int[] coins = {1,2,5};
	  int amount = 11;
	  
	  coinChange(coins, amount);
	 
  }
 
}
