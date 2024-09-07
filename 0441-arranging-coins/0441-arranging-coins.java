class Solution {
    public int arrangeCoins(int n) {
       int level=0;
       int coin =1;
       while(coin<=n){
            n = n-coin;
        coin++;
        level++;
       }
       return level;
    }
}