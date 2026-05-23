class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        dfs(0,nums,temp,set);
        return new ArrayList<>(set);
    }
    public void dfs(int i,int[] nums,List<Integer> temp,HashSet<List<Integer>> set){
        if(i==nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        dfs(i+1,nums,temp,set);
        temp.remove(temp.size()-1);
        dfs(i+1,nums,temp,set);
    }
}
