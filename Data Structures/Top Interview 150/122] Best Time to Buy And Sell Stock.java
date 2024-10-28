//It has a runtime of 1ms And Time complexity of O(N).
//This is medium level question but has a simpler logic than 121]
//Approach: whenever the next element is greater than the current then Add the difference to the profit.
class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int profit = 0 ;
        for ( i = 1 ; i < prices.length ; i++){
            if ( prices[i] > prices[i - 1] ){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
