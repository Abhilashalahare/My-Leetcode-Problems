class Solution {
    public int minimumDistance(int[] nums) {
        int minDis = Integer.MAX_VALUE;
        int n=nums.length;
        if(n<3){
            return -1;
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k])
                    {int sum = (j-i)+(k-j)+(k-i);
                    minDis = Math.min(sum, minDis);}
                }
            }
        }
        return minDis==Integer.MAX_VALUE? -1: minDis;
    }
}