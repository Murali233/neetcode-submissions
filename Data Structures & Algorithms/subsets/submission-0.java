class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        dfs(0,nums,temp,list);
        return list;
    }
    public void dfs(int i,int[] nums,List<Integer> temp,List<List<Integer>> list){
        if(i==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        dfs(i+1,nums,temp,list);
        temp.remove(temp.size()-1);
        dfs(i+1,nums,temp,list);
    }
}
