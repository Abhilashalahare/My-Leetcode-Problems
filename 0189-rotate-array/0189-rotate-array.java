class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;  // Normalize k to handle larger values of k
        reverse(nums, 0, n -k- 1);       // Step 1: Reverse the entire array
        reverse(nums, n-k, n - 1);       // Step 2: Reverse the first k elements
        reverse(nums, 0, n - 1);       // Step 3: Reverse the remaining elements
    }
    
    // Helper function to reverse elements in the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}



    
  
    
    
