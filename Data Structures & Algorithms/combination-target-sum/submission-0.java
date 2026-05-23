class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findcombination(0,nums,target,temp,list);
        return list;
    }
    public void findcombination(int i,int[] nums,int target,List<Integer> temp,List<List<Integer>> list){
        if(i==nums.length){
            if(target==0){
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        if(nums[i]<=target){
            temp.add(nums[i]);
            findcombination(i,nums,target-nums[i],temp,list);
            temp.remove(temp.size()-1);
        }
        findcombination(i+1,nums,target,temp,list);
    }
}
