class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n-1] > nums[n-2]) return n-1;

    int left = 1; // Initialize the left boundary of the search space
        int right = n-2; // Initialize the right boundary of the search space
      
        // Continue the loop until the search space is reduced to one element
        while (left <= right) {
            // Calculate the middle index of the current search space
            int mid = (left + right ) / 2;
          
           if(nums[mid-1]< nums[mid] && nums[mid]>nums[mid+1]) return mid;

           if(nums[mid]> nums[mid+1]){
            right = mid-1;
           }else{
            left = mid+1;
           }
            
        }
      
        // When left == right, we have found the peak element's index, return it
        return left;
    }
}