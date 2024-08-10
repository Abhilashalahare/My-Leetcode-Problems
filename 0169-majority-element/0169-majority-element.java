class Solution {
    public int majorityElement(int[] nums) {
        //when we will sort this array the middle element will always lie in the majority elements.
        int mid = (nums.length)/2;
        Arrays.sort(nums);
        return nums[mid];
    }
}