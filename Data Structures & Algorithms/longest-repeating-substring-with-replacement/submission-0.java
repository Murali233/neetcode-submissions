class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxilen=0;
        for(int i=0;i<n;i++){
            int[] hash=new int[26];
            int maxi=0;
            for(int j=i;j<n;j++){
                int num=s.charAt(j)-'A';
                hash[num]++;
                maxi=Math.max(maxi,hash[num]);
                int changes=(j-i+1)-maxi;
                if(changes<=k) maxilen=Math.max(maxilen,j-i+1);
                else break;
            }
        }
        return maxilen;
    }
}
