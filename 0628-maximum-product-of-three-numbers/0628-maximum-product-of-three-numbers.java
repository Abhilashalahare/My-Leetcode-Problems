class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

            int prod = nums[n-1]*nums[n-2]*nums[n-3];
            int prod2 = nums[n-1]*nums[0]*nums[1];

            int max = Math.max(prod,prod2);
        return max;
    }
}