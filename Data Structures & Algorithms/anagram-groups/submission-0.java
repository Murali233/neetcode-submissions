class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        Map<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedstr=new String(ch);
            mp.putIfAbsent(sortedstr,new ArrayList<>());
            mp.get(sortedstr).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}
