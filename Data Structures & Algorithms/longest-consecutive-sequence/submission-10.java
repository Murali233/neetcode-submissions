class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int maxi=1;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int cnt=1;
            if(set.contains(num-1)) continue;
            while(set.contains(num+1)){
                cnt++;
                maxi=Math.max(maxi,cnt);
                num=num+1;
            }
        }
        return maxi;
    }
}
