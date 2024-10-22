class Solution {
    public int characterReplacement(String s, int k) {
        int[] letter= new int[26];
        int r,max=0;
        int l=0;
        int n = s.length();
        

        for(r=0; r<n; r++){
            char curr = s.charAt(r);
            letter[curr-'A']++;

            max = Math.max(max, letter[curr-'A']);

            if((r-l+1) - max >k){
                letter[s.charAt(l) - 'A']--;
                l++;
            }

          
        }
        

     return n-l;

    }
}