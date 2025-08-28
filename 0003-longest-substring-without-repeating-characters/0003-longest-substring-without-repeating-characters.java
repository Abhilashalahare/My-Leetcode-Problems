class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r =0;
        int maxLen = 0;
        int n= s.length();
        int hash[] = new int[256]; //97-a, 98-b
        
        for(int i=0; i<256; i++){
            hash[i] = -1;
        }

        if(n==0) return maxLen;

        while(r<n){
            char ch = s.charAt(r);
            if(hash[ch] != -1){// means it is in the map already 
                if(hash[ch] >= l){ //larger index pe a aya , or phle se a chhote index pe h, to chhote index k bad vale index pe l jayega
                    l = hash[ch] +1;
                }
            }
            int len = r-l+1;
            maxLen = Math.max(maxLen, len);
            hash[ch] = r;
            r++;
            


        }
return maxLen;
    }
}