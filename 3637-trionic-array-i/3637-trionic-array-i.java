class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i+1<n && nums[i]<nums[i+1]){//inc
                 i++;
        }
        if(i==0 || i==n-1) return false;  //no inc seq found or all in inc order till end 

        while(i+1<n && nums[i]>nums[i+1]){//dec
              i++;
        }
        if(i==n-1) return false; //dec till end

        while(i+1<n && nums[i]<nums[i+1]){//inc
                 i++;
        }
        if(i==n-1) return true;
        else return false;



    }
}