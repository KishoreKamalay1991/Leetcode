public class Timetobuyandsell {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No profit can be made
        }
        
        int minPrice = Integer.MAX_VALUE; // Take minprice as Maxvalue
        int maxProfit = 0;
        
        for (int price : prices) { // Loop all prices
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
                System.out.println("minPrice: " + minPrice);
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit
            }
        }
        
        return maxProfit;
    }
    
}
