class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         long maxSum = 0;
        long sum = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            // Shrink the window if a duplicate is found
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add the new element to the window
            set.add(nums[right]);
            sum += nums[right];

            // If window size is exactly k, check maxSum
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                
                // Slide the window by removing the leftmost element
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}