class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int minbuy=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-minbuy;
            profit=Math.max(profit,cost);
            minbuy=Math.min(minbuy,prices[i]);
        }
        return profit;
        
    }
}
