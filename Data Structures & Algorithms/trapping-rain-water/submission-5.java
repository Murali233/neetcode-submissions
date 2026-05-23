class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int area=0;
        int i=0,j=0;
        int leftmax=0;
        while(i<n){
            leftmax=Math.max(leftmax,height[i]);
            j=i;
            int rightmax=0;
            while(j<n){
                rightmax=Math.max(height[j],rightmax);
                j++;
            }
            area+=Math.min(leftmax,rightmax)-height[i];

            i++;
        }
        return area;
    }
}
