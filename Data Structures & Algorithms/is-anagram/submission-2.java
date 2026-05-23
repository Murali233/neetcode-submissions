class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            freq[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
        
    }
}
