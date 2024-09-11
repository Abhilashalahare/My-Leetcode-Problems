class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<=0) return false;
       int cnt=0;
       for(int i=0; i<32; i++){
        if((n&(n<<i))>0){
            cnt++;
        }
       }
       return cnt==1;
    }
}