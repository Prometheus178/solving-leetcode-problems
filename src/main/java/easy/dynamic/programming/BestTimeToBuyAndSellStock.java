package easy.dynamic.programming;

/**
 * Time complexity O(n)
 * Space complexity O(1)
 * Author: Sergey.
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int range = solve(new int[]{3,2,6,5,0,5});
        System.out.println(range);
    }

    public static int solve(int[] prices) {
        int maxProfit = 0;
        if (prices.length <= 1) {
            return maxProfit;
        }
        int l = 0;
        int r;
        for (r = 1 ; r < prices.length; r++) {
            int buy = prices[l];
            int sell = prices[r];
            if (buy < sell){
               int range =  sell - buy;
               if (range > maxProfit){
                   maxProfit = range;
               }
            }else{
                l = r;
            }
        }
        return maxProfit;
    }
}
