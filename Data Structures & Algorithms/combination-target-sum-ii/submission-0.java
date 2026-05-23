class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findcomb(0,candidates,target,temp,list);
        return list;
    }
    public void findcomb(int ind,int[] nums,int target,List<Integer> temp,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            if(i>ind&&nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;
            temp.add(nums[i]);
            findcomb(i+1,nums,target-nums[i],temp,list);
            temp.remove(temp.size()-1);
        }
    }
}
