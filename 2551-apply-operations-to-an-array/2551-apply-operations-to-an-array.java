class Solution {
    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        int i;
        for(i = 0; i < nums.length - 1; i++){
            if(nums[i] != 0){
                if(nums[i] == nums[i + 1]){
                    result[j] = nums[i] * 2;
                    i++;
                }
                else{
                    result[j] = nums[i];
                }
                j++;
            }
        }
        if(i != nums.length){
            result[j] = nums[nums.length - 1];
        }
        return result;
    }
}