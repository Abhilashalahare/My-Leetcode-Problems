class Solution {
    public int[] sortedSquares(int[] nums) {
       int i=0;
       int n= nums.length;
       int[] ans = new int[n];
       if(n==1){
        ans[0] = nums[0]*nums[0];
       }
       while(i<n && nums[i]<0){
             i++;
       }
       i--;
       int j=i+1;
       int k=0;//ans pointer
       

       while(i>=0 && j<n){
        if(nums[i]* nums[i] <= nums[j]*nums[j]){
            ans[k++] = nums[i]* nums[i];
            i--;
        }else{
            ans[k++] = nums[j]*nums[j];
            j++;
        }

       }

       while(i>=0){
        ans[k++] =  nums[i]* nums[i];
        i--;
       }

       while(j<n){
         ans[k++] = nums[j]*nums[j];
            j++;
       }

       return ans;
    }
}