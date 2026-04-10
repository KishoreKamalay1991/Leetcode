package DynamicProgramming;

public class bestTimetoBuyandsellStocks {
    public static int maxProfit(int[] nums) {
		
		int maxProfit = 0;
		
		
			 int minPrice = Integer.MAX_VALUE;
			 
			 for(int price : nums) {
				 if(price < minPrice) {
					 minPrice = price;
				 } else if(price - minPrice > maxProfit) {
					 maxProfit = Math.max(maxProfit, price - minPrice);
				 }
			 }
		
		     return maxProfit;
	}
	
	public static void main(String[] args) {
		
		int[] prices = {7,1,5,3,7,4};
		
	    int result = maxProfit(prices);
		
		System.out.println("result " + result);
	}
}
