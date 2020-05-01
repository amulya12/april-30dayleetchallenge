class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
           return 0;
       }
       int[] dp = new int[prices.length];
       int max = dp[0] - prices[0];
       for (int i = 1; i < prices.length; i++) {
           dp[i] = Math.max(dp[i-1], prices[i] + max);
           max = Math.max(max, dp[i-1] - prices[i]);
       }
       return dp[prices.length - 1];
        
    }
}