class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        

        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            s1[ch-'a']++;
        }

         for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            t1[ch-'a']++;
        }

        for(int i=0; i<s1.length; i++){
            if(s1[i] != t1[i]){
              return false;
            }
        }

       
       return true;


    }
}