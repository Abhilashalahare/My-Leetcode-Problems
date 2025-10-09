class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open =0;
        int close = 0;

        func(open, close, ans, n, "");
         return ans;
    }

    public void func(int o, int c, List<String> ans, int n, String s){
        if(o>n || c>n || o<c) return;
        if(o == n && c==n){
            ans.add(s);
            return;
        }

        func(o+1, c, ans, n, s+"(");
        func(o, c+1, ans, n, s+")");


       

    
    }
}