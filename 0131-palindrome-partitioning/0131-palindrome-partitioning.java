class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> ans = new ArrayList<>();
         func(0, s, ans, new ArrayList<>());
         return ans;
    }

    void func(int idx, String s,List<List<String>> ans, List<String> ds ){
        if(idx==s.length()){
                ans.add(new ArrayList<>(ds));
                return;
            
        }
       for(int i=idx; i<s.length(); i++){
         if(isPalin(s, idx,i)){
            
             ds.add(s.substring(idx,i+1));
          func(i+1, s, ans, ds);
          ds.remove(ds.size()-1);
       }
       }
     
    }

     private boolean isPalin(final String s, int l, int r) {
    while (l < r)
      if (s.charAt(l++) != s.charAt(r--))
        return false;
    return true;
  }

     
}