class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int need=-(nums[i]+nums[j]);
                if(map.containsKey(need)){
                    int value=map.get(need);
                    List<Integer> temp=new ArrayList<>(); 
                    temp.add(nums[i]); 
                    temp.add(nums[j]); 
                    temp.add(need); 
                    Collections.sort(temp); 
                    set.add(temp);
                }
            }
            map.put(nums[i],i);
        }
        return new ArrayList<>(set);
    }
}
