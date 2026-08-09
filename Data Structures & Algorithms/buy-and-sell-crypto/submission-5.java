class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxiprofit=0;
        int mini=prices[0];
        for(int i=1;i<n;i++){
            int profit=prices[i]-mini;
            mini=Math.min(mini,prices[i]);
            maxiprofit=Math.max(profit,maxiprofit);
        }
        return maxiprofit;
    }
}
