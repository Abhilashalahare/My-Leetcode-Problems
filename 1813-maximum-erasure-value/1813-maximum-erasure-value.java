class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l = 0, r = 0;
        int sum = 0, maxSum = 0;

        while (r < nums.length) {
            if (!set.contains(nums[r])) {
                set.add(nums[r]);
                sum += nums[r];
                maxSum = Math.max(maxSum, sum);
                r++;
            } else {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
        }

        return maxSum;
    }
}
