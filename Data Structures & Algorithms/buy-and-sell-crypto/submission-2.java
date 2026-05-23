class Solution {
    public int maxProfit(int[] prices) {
        int maxiprofit=0;
        int n=prices.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(prices[i],mini);
            maxiprofit=Math.max(maxiprofit,prices[i]-mini);
        }
        return maxiprofit;
    }
}
