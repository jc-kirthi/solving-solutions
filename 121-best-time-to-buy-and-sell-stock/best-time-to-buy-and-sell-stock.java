class Solution {
    public int maxProfit(int[] prices) {
        // Track the lowest buying price seen so far
        int minPrice = Integer.MAX_VALUE;
        // Track the highest profit found so far
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // Found a cheaper day to buy
                minPrice = prices[i];
            } else {
                // Check if selling today gives a better profit
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        
        return maxProfit;
    }
}
