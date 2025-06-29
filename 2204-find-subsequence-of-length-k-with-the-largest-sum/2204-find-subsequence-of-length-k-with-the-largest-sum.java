class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
    int n = nums.length;

        // Store (value, index) pairs
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort by value descending
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        // Take top k
        Arrays.sort(pairs, 0, k, Comparator.comparingInt(a -> a[1]));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pairs[i][0];
        }

        return result;

    }

}