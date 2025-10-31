public class practise {

     public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int i = 0;
        int j = i + 1;

        while(i < j) {

            maxProfit = Math.max(maxProfit, prices[j] - prices[i]); 

        }



         return 0;
     }

    public static void main(String[] args) {
       
      int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));        

    }
    
}
