class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        if(rev(x)){
            return true;
        }
        return false;
    }

    private boolean rev(int x){
        int ori = x;

        int ans = 0;
        
        while(x != 0){
          int rem = x % 10;
        ans = ans*10 + rem;
        x /= 10;
        }
        

        if(ori == ans){
            return true;
        }

        return false;

    } 
}