class Solution {
    public int[] sortedSquares(int[] nums) {
    
    
        // Arrays.sort(nums);
        int[] arr = new int[nums.length];
       
        for(int i=0; i<nums.length; i++){
            int sq = nums[i] * nums[i];
            arr[i] = sq;
         
        }
        Arrays.sort(arr);

        return arr;
    }
}