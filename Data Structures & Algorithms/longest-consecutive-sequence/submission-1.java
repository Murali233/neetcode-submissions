class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int maxi=1;
        if(n==0) return 0;
        int cnt=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]-1){
                cnt++;
                maxi=Math.max(maxi,cnt);
            }
            else if(nums[i]==nums[i+1]) continue;
            else cnt=1;
        }
        return maxi;
    }
}
