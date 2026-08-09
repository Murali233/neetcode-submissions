class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=prices[j]-prices[i];
                maxi=Math.max(maxi,profit);
            }
        }
        return maxi;
    }
}
