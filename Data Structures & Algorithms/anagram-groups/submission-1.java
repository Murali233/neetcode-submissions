class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String sorteds=new String(ch);
            map.putIfAbsent(sorteds,new ArrayList<>());
            map.get(sorteds).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
