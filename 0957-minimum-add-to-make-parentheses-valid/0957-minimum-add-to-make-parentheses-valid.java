class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){//closing 
               if(!st.isEmpty() && st.peek()=='('){ //if opening then pop
                st.pop();
               }else{
                st.push(ch);
               }
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}