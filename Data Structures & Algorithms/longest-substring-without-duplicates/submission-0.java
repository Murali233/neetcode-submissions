class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=0;
        for(int i=0;i<n;i++){
            HashSet<Character> set=new HashSet<>();
            int cnt=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(!set.contains(ch)){
                    cnt++;
                    set.add(ch);
                }
                else{
                    break;
                }
            }
            maxi=Math.max(set.size(),maxi);
        }
        return maxi;
    }
}
