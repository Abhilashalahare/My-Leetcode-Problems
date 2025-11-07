class Solution {
    public int maxAbsoluteSum(int[] nums) {
     int sum=0, pmax =0;
     int nmax =0;
  
   for(int i=0; i<nums.length; i++){
     sum += nums[i];

     pmax = Math.max(pmax, sum);
     nmax = Math.min(nmax, sum);
   }
     

     
       return pmax - nmax;
    }
}