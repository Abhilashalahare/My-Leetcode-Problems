class Solution {
    public int coinChange(int[] coins, int sum) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // 0 coins needed to make sum 0
        }

        for (int j = 1; j <= sum; j++) {
            dp[0][j] = sum + 1; // Sentinel value for impossible case
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum] > sum ? -1 : dp[n][sum];
    }
}
