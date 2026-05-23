class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            int num=nums[i];
            while(set.contains(num)){
                cnt++;
                num++;
            }
            maxi=Math.max(cnt,maxi);
        }
        return maxi;
    }
}
