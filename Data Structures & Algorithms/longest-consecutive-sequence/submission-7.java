class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==0) return 0;
        int maxi=1;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]) continue;
            if(nums[i-1]+1==nums[i]){
                cnt++;
                maxi=Math.max(cnt,maxi);
            }
            else{
                cnt=1;
            }
        }
        return maxi;
    }
}
