class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int area=0;
        int[] suffix=new int[n];
        int[] prefix=new int[n];
        int maxi=height[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,height[i]);
             prefix[i]=maxi;
        }
        maxi=height[n-1];
        for(int i=n-1;i>=0;i--){
            maxi=Math.max(maxi,height[i]);
            suffix[i]=maxi;
        }
        for(int i=0;i<n;i++){
            area+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return area;
    }
}
