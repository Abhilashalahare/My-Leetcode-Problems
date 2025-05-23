class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i : nums) {
            sum += i;
        }

        if (sum % 2 != 0) return false;

        return fun(nums, sum / 2, n);
    }

    private Boolean fun(int arr[], int sum, int n) {
     
       
        boolean[][] t = new boolean[n+1][sum+1];
        
        
        for(int i=0; i<n+1; i++){
            for(int j=0; j<sum+1; j++){
                if(i==0) t[i][j] = false; //0th row
                if(j==0) t[i][j] = true; //0th column
            }
        }
        
        
       for(int i=1; i<n+1; i++){
           for(int j=1; j<sum+1; j++){
               if(j >= arr[i-1]){
                t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
               }else{
                   t[i][j] =  t[i-1][j];
               }
           }
       }
        
        
        
        return t[n][sum];
        
        
        
        
        
        
    }
}
