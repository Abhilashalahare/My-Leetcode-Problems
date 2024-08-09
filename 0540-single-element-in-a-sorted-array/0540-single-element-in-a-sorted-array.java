class Solution { //using xor
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int i=0; i<nums.length; i++){
           xor = xor^nums[i];
            
}
return xor;
    }
}