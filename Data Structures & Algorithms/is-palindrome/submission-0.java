class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        int n=str.length();
        int l=0;
        int h=n-1;
        while(l<h){
            if(str.charAt(l)!=str.charAt(h)) return false;
            else{
                l++;
                h--;
            }
        }
        return true;
    }
}
