class Solution {
    public long mostPoints(int[][] questions) {
          int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp, -1);
        return helper(0, questions, dp);
    }
    
    private long helper(int i, int[][] questions, long[] dp) {
        if (i >= questions.length) return 0;
        if (dp[i] != -1) return dp[i];
        
        // Choosing to solve the current question
        long solve = questions[i][0] + helper(i + questions[i][1] + 1, questions, dp);
        // Choosing to skip the current question
        long skip = helper(i + 1, questions, dp);
        
        dp[i] = Math.max(solve, skip);
        return dp[i];
    }
}