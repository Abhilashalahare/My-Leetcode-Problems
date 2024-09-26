class Solution {
    public int majorityElement(int[] nums) {
        int elet =0;
        int cnt=0;

        for(int i=0; i<nums.length; i++){
            if(cnt == 0){
                cnt =1;
                elet = nums[i];
            }else if(elet == nums[i]){
                cnt++;
            }else{
                cnt--;
            }

        }

            int cnt1=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == elet){
                    cnt1++;
                }
            
           
            }
        

         if(cnt1 > (nums.length)/2){
                return elet;
            }
            return -1;
    }
}