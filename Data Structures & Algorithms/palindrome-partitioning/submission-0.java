class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        func(0,s,temp,list);
        return list;
    }
    public void func(int ind,String s,List<String> temp,List<List<String>> list){
        if(ind==s.length()){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPd(s,ind,i)){
                temp.add(s.substring(ind,i+1));
                func(i+1,s,temp,list);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPd(String s,int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)) return false;
        }
        return true;
    }
}
