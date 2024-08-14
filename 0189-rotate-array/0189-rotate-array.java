class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;
       ArrayList<Integer> arr = new ArrayList<>();
   
       for(int i=n-k; i<=n-1; i++){
        arr.add(nums[i]);
       }
        for(int i=0; i<n-k; i++ ){
        arr.add(nums[i]);
       }
       for(int i = 0; i < arr.size(); i++){
        nums[i] = arr.get(i);
       }
       


    
    }
}   
    
    
