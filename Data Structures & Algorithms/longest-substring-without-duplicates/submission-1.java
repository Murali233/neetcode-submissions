class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=0;
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int r=0;
        for(r=0;r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}
