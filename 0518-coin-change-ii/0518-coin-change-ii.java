class Solution {
    public int change(int amount, int[] coins) {
        int n= coins.length;

        return fun(amount, coins, n);
    }

    private int fun(int amt, int[] arr, int n){
        int[][] dp = new int[n+1][amt+1];

        for(int i=0; i<n; i++){
            dp[i][0] = 1;
        }
        for(int j=1; j<amt; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<=n; i++){
            for(int j=0; j<=amt; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amt];

    }
}