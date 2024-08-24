class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ori = x;
        int ans=0;
     while(x!=0) {
     
        int rem = x%10;
      ans = (ans*10)+rem;
        x=x/10;
     }
     if(ans==ori){
        return true;
     }
     return false;
    }

}