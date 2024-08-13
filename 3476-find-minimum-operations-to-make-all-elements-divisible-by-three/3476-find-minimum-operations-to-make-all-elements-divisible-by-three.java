class Solution {
    public int minimumOperations(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i]-1;
            int m = nums[i] +1;
            if(n%3==0 || m%3==0 ){
                count++;
            }
        }
        return count;
    }
}