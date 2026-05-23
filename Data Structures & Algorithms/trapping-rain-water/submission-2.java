class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int area=0;
        for(int i=0;i<n;i++){
            int j=i;
            int leftmax=height[j];
            while(j>=0){
                leftmax=Math.max(height[j],leftmax);
                j--;
            }
            j=i;
            int rightmax=height[j];
            while(j<n){
                rightmax=Math.max(height[j],rightmax);
                j++;
            }
            area+=Math.min(leftmax,rightmax)-height[i];
        }
        return area;
    }
}
