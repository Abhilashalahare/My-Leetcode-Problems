class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int two = 0;
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                one++;
            }else if (nums[i]==2){
                two++;
            }else{
                zero++;
            }
        }

        for(int i=0; i<nums.length; i++){
           if(zero>0){
            nums[i]=0;
            zero--;
           }else if(one>0){
            nums[i] = 1;
            one--;
           }else{
            nums[i]=2;
            two--;
           }
        }
        return;
           }

}