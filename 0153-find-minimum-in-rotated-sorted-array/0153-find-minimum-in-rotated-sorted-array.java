class Solution {
    public int findMin(int[] nums) {
         int left=0;
         int right=nums.length-1;
      int min = 5000;

      while(left<=right){
        int mid=(left+right)/2;

        // if(nums[eft] <= nums[right]){
        //     if(nums[left]<ans){
        //         ans = nums[left];
        //     }
        //      min = Math.min(min, nums[left]);
        //      break;
        // }
        
        if(nums[left] <= nums[mid]){//if left is sorted check the min and eleiminate left half
            min = Math.min(min, nums[left]);
            left = mid+1;
        }else{// same for right, here min is mid not the end value 
            min = Math.min(min, nums[mid]);
            right = mid-1;
        }
      
      }
      return min;
    }
}