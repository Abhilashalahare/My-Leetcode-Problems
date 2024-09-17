class Solution {
    public boolean check(int[] nums) {
        
      int cnt = 0;
        for (int i = 0, n = nums.length; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                ++cnt;
            }
        }
        if( cnt <= 1) return true;
return false;
    }
}