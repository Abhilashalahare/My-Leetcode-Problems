class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int num=nums.length-1;

        return nums[num - k + 1];

    }
}