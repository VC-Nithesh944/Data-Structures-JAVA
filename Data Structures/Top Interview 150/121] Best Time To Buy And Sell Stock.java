//Has a runtime of 2ms and Time complexity of O(N).
// Its always prices[i] - min to profit;

class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int min = 10000;
        int profit = 0;
        for (i = 0 ; i < prices.length ; i++){
            if (prices[i] < min){
                min = prices[i];
            }
            if (prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
