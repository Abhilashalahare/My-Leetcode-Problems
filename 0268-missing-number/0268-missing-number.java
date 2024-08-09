class Solution {
    public int missingNumber(int[] nums) {
       /* Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=i){
                return i;

            }

        }
        return nums.length;*/
        int n= nums.length;
     int sum=0;
     int Nsum= (n*(n+1))/2;
      for(int i=0; i<n; i++){
        sum= sum+nums[i];
      }
     return Nsum-sum;
    }
}