class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for(int i: nums){
            totalSum+=i;
        }
        
        int left=0, right =0;
        for(int i=0; i<nums.length; i++){
           
            right = totalSum - left - nums[i];

            if(left == right){
                return i;
            }
            
             left += nums[i];
        }
        return -1;
    }
}