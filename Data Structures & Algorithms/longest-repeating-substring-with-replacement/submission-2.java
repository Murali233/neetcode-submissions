class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int r=0;
        int maxilen=0;
        int[] hash=new int[26];
        int maxif=0;
        while(r<n){
            int num=s.charAt(r)-'A';
            hash[num]++;
            maxif=Math.max(maxif,hash[num]);
            if((r-l+1)-maxif>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxif<=k) maxilen=Math.max(maxilen,r-l+1);
            r++;
        }
        return maxilen;
    }
}
