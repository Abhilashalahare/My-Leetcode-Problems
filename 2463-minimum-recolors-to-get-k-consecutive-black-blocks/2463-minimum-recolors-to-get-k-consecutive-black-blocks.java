class Solution {
    public int minimumRecolors(String blocks, int k) {
          int n = blocks.length();
        int minOperations = Integer.MAX_VALUE;
        int whiteCount = 0;

        // Count 'W' in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
        minOperations = whiteCount; // Initialize with first window

        // Slide the window
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') whiteCount--; // Remove outgoing element
            if (blocks.charAt(i) == 'W') whiteCount++; // Add incoming element
            minOperations = Math.min(minOperations, whiteCount);
        }

        return minOperations;
    }
}