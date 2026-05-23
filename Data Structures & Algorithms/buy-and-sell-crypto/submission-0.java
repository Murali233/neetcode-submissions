class Solution {
    public int maxProfit(int[] prices) {
        int maxiprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=prices[j]-prices[i];
                maxiprofit=Math.max(maxiprofit,profit);
            }
        }
        return maxiprofit;
    }
}
