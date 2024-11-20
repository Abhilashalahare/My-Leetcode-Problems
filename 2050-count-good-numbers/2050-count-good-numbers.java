class Solution {
    private long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        // long first = pow(5,even)%mod;
        return (int)((pow(5,even)* pow(4,odd))%mod);
    }

    public long pow(long x,long y){
        if(y==0){
            return 1;
        }
        long ans = pow(x,y/2);
        if(y%2==0) {
            return (ans*ans)%mod;
        }else{
            return (ans*ans*x)%mod;
        }
     
    }
}