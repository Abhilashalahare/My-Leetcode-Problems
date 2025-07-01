class Solution {
    public int possibleStringCount(String word) {
        int ans =1;
        int freq=0;

       for(int i=0; i<word.length()-1; i++){
        if(word.charAt(i) == word.charAt(i+1)){
            freq ++; 
        }
       } 
       return ans+freq;

       
    }
}