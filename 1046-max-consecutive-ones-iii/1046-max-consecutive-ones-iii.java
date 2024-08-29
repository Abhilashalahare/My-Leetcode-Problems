class Solution {
    public int longestOnes(int[] nums, int k) {
        int count =0;
        int l=0, r=0, max=0;

        int n = nums.length;

        while(r<n){
            if(nums[r]==0) count++;
            while(count>k && l<=r){
                if(nums[l]==0) count--;
                l++;
            }
            max= Math.max(max, r-l+1);
            r++;
        }
        return max;

    }
}