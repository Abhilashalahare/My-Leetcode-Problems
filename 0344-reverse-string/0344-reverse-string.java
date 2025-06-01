class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        for(int c=0; c<s.length/2; c++){
            char temp = s[c];
            s[c] = s[n];
            s[n] = temp;
            n--; 
        }
    }
}