class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int area=0;
        int[] suffix=new int[n];
        int leftmax=height[0];
        int maxi=height[n-1];
        for(int i=n-1;i>=0;i--){
            maxi=Math.max(maxi,height[i]);
             suffix[i]=maxi;
        }
        for(int i=0;i<n;i++){
            leftmax=Math.max(leftmax,height[i]);
            area+=Math.min(leftmax,suffix[i])-height[i];
        }
        return area;
    }
}
