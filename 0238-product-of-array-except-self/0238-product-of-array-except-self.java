class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            pref[i] = mul;
            mul = mul*nums[i];
        }
        mul =1;
        for(int j=nums.length-1; j>=0; j--){
            suff[j] = mul;
            mul = mul*nums[j];
        }
        int[] arr= new int[nums.length];
        for(int i=0; i<arr.length; i++){
            arr[i]= pref[i]*suff[i];
        }

        return arr;
    }
}