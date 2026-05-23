class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int l=0;
        int r=0;
        int maxi=0;
        while(r<n){
            if(prices[r]<prices[l]){
                l=r;
            }
            maxi=Math.max(maxi,prices[r]-prices[l]);
            r++;
        }
        return maxi;
    }
}