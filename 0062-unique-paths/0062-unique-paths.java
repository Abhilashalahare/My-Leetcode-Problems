class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // initialize with -1 (unvisited)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return gridWays(0, 0, m, n, dp);
    }

    public int gridWays(int x, int y, int m, int n, int[][] dp) {
        if (x == m || y == n) {
            return 0; // out of bounds
        }

        if (x == m - 1 && y == n - 1) {
            return 1; // reached destination
        }

        // if already computed, return stored result
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        // move right and down
        int way1 = gridWays(x + 1, y, m, n, dp);
        int way2 = gridWays(x, y + 1, m, n, dp);

        dp[x][y] = way1 + way2; // store result before returning
        return dp[x][y];
    }
}
