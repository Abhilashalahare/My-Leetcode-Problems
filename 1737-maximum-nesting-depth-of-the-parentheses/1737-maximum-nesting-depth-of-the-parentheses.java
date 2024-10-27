class Solution {
    public int maxDepth(String s) {
        int cnt =0;
        int max = 0;
       for(int i=0; i<s.length(); i++){
        char c= s.charAt(i);

        if(c =='('){
            cnt++;

            max = Math.max(max, cnt);
        }else if(c==')'){
            cnt--;
        }
       }
       return max;
    }
}