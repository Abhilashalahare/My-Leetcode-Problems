class Solution {
    public int majorityElement(int[] nums) {
        int elet =0;
        int cnt=0;

        for(int i=0; i<nums.length; i++){
            if(cnt == 0){
                 cnt =1;
                elet = nums[i];
            }else if(nums[i]==elet){
                cnt++;
            }else{
                cnt--;
            }

        }
     return elet;
         
    }
}